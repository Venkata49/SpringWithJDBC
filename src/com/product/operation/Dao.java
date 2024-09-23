package com.product.operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	
//	OurConfiguration JDBCTemplate Inject into Dao throw @Autowired

	@Autowired
	private JdbcTemplate jdbc ;
	
	@Autowired
	private NamedParameterJdbcTemplate npjtp;
	
	
//	NamedParameterJdbcTemplate Operations Started Here....

		public void savenpjt(productPojo pp) {
			System.out.println("Dao Operation Started..");
			
			MapSqlParameterSource mp = new MapSqlParameterSource();
			mp.addValue("productId", pp.getProductId());
			mp.addValue("productName", pp.getProductName());
			mp.addValue("productPrice", pp.getProductPrice());
			mp.addValue("productGst", pp.getProductGst());
			mp.addValue("productModel", pp.getProductModel());
			
			String inQuery = "insert into productPojo(productId,productName,productPrice,productGst,productModel) values(:productId, :productName, :productPrice, :productGst, :productModel)";
			
			int row = npjtp.update(inQuery, mp);
			System.out.println("Dao Operation Completed.."+ row);

			
		}
		
//		Update Operation NamedParameterJdbcTemplate....
		
		public void updatenpjt(int productInt, double productPrice) {
			System.out.println("Dao Operation Started..");
			
			MapSqlParameterSource mp = new MapSqlParameterSource();
			mp.addValue("productId", productInt);
			mp.addValue("productPrice", productPrice);


			String updateOperation = "update product.productpojo set productPrice = :productPrice where productId = :productId ";
			
			int rowUp = npjtp.update(updateOperation, mp);
			
			System.out.println("Row Effected : "+ rowUp);
			
			System.out.println("Dao Operation Completed..");

		}
		
//		Save Operation...
		
	public void save(productPojo pro) {
		System.out.println("Dao Operation Started..");
		String str = ("insert into product.productpojo values(?,?,?,?,?)");
		int rowInsert = jdbc.update(str,pro.getProductId(),pro.getProductName(),pro.getProductPrice(),pro.getProductGst(),pro.getProductModel());
		System.out.println("One Row Effected : "+rowInsert);
		
		System.out.println("Dao Operation Completed..");
	}

//	Update Operation...
	
	public void update(int productInt, double productPrice) {
		System.out.println("Dao Operation Started..");

		String updateOperation = "update product.productpojo set productPrice =? where productId = ? ";
		
		int rowUp = jdbc.update(updateOperation, productPrice, productInt );
		
		System.out.println("Row Effected : "+ rowUp);
		
		System.out.println("Dao Operation Completed..");

	}
	
//	Delete Operation...
	
	public void delete(int productId) {
		System.out.println("Dao Operation Started..");
		
		String deletequery = "delete from product.productPojo where productId = ?";
		int rowdel = jdbc.update(deletequery);
		System.out.println("row effected : "+ rowdel);
				
		System.out.println("Dao Operation Completed..");

	}
	
//	getById()....
	
	public  void getById(int productId) {
		System.out.println("Dao Operation Started...");
		String QueryById = "select productName from product.productpojo where productId = ?";
		String find = jdbc.queryForObject(QueryById, String.class,productId);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	getByName()....
	
	public  void getByName(String productName) {
		System.out.println("Dao Operation Started...");
		
		Double find = jdbc.queryForObject("select productPrice from product.productpojo where productName = ?", Double.class, productName);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	getByIdRow()....
	
	public void getByIdRow(int productId) {
		System.out.println("Dao Operation Started...");
		
		productPojo find = jdbc.queryForObject("select *from product.productpojo where productId = ?",new BeanPropertyRowMapper<productPojo>(productPojo.class),productId);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
		
	}
	
//	getAll()....
	
	public  void getAll() {
		System.out.println("Dao Operation Started...");
		
		List<productPojo> find = jdbc.query("select * from product.productpojo ",new BeanPropertyRowMapper<productPojo>(productPojo.class));
		
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	Aggregate() Operations ....
	
//	Count()....
		
	public  void count() {
		System.out.println("Dao Operation Started...");
		
		Double find = jdbc.queryForObject("select count(*) from product.productpojo",Double.class);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
//	Count()....
	
	public  void max() {
		System.out.println("Dao Operation Started...");
		
		Double find = jdbc.queryForObject("select max(productPrice) from product.productpojo",Double.class);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	Average()....
	
	public  void avg() {
		System.out.println("Dao Operation Started...");
		
		Double find = jdbc.queryForObject("select avg(productPrice) from product.productpojo",Double.class);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	sum()....
	
	public  void sum() {
		System.out.println("Dao Operation Started...");
		
		Double find = jdbc.queryForObject("select sum(productPrice) from product.productpojo",Double.class);
		System.out.println(find);
		
		System.out.println("Dao Operation Completed...");
	}
	
//	GetAll() Operation using List<Map<String, Object>>....
	
	public void selectQuery() {
		System.out.println("Dao Started....");
		
		List<Map<String, Object>> all =  jdbc.queryForList("select*from product.productpojo");
		for(Map<String, Object> nu : all) {
			System.out.println(nu);
		}
		System.out.println("Dao Completeds....");
	}

	
//	Insert data into database using batchupdates....
	
	public void batchUpdates(productPojo produ) {
		System.out.println("Dao Started....");
		
		String insert = "insert into product.productpojo values(?,?,?,?,?)";
		
//		This is one way to insert values into database...
		
		List<Object[]> ob = new ArrayList();
		ob.add(new Object[] {5,"Poco",60000.00,9.1,"Poco104"});
		ob.add(new Object[] {6,"ReadMi",65000.00, 9.1,"Mi103"});

		ob.add(new Object[] {7,"Nothing",73000.00, 7.0,"Nothing777"});
		ob.add(new Object[] {8,"CMF",49000.00, 5.5,"Cmf593"});

		int[] h = jdbc.batchUpdate(insert, ob);
		System.out.println("row effected : "+h);
		
		
		System.out.println("Dao Completeds....");
	
		
	}
	
//	FileUpload Operation...
	
	public List<productPojo> uploadFile(String fileName){
		
		List<productPojo> k = new ArrayList<>();
		String path = "C:\\Learner\\usage\\"+ fileName;
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			for(String s = br.readLine(); s != null; s = br.readLine()) {
				productPojo po = new productPojo();
				String[] data = s.split(",");
				po.setProductId(Integer.parseInt(data[0]));
				po.setProductName(data[1]);
				po.setProductPrice(Double.parseDouble(data[2]));
				po.setProductGst(Double.parseDouble(data[3]));
				po.setProductModel(data[4]);
				
				k.add(po);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
		
	}
	
//	savebatch into fileupload operation...
	
	public void saveBatchUpdate(String fileName) {
		
		List<productPojo> cal = uploadFile(fileName);
		System.out.println("Dao Started ... "+ fileName);
		String insertQuery = "insert into product.productPojo values(?,?,?,?,?);";
		List<Object[]> parameter = new ArrayList();
		
		for(productPojo n : cal) {
			Object[] pdata = {n.getProductId(),n.getProductName(),n.getProductPrice(),n.getProductGst(),n.getProductModel()};
			parameter.add(pdata);
		}
		
		int[] k = jdbc.batchUpdate(insertQuery, parameter);
		System.out.println("No: of records inserted : "+ k.length);
				
	}	
	
}




