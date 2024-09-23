package com.socialmedia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.product.operation.productPojo;


@Component
public class Dao {
	
	@Autowired
	private JdbcTemplate templete;
	
	
//	FileRead data ....
	
	
	public List<YoutubePojo> getFileData(){
		
		List<YoutubePojo> data = new ArrayList();
		
		try {
			FileReader fr  = new FileReader("C:\\Learner\\usage\\YoutubeData.txt");
			BufferedReader br = new BufferedReader(fr);
			
			for(String s = br.readLine(); s!=null; s= br.readLine()) {
				
				YoutubePojo e = new YoutubePojo();

				String[] k = s.split(",");
				e.setYouId(Integer.parseInt(k[0]));
				e.setYouName( k[1]);
				e.setYouChanalName(k[2]);
				e.setYouIncome(Double.parseDouble(k[3]));
				e.setYoufollowers( Integer.parseInt(k[4]));
				
				data.add(e);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	public void save(YoutubePojo you) {
		System.out.println("Dao Started..");
		
		List<YoutubePojo> po = getFileData();
		
		String insertQuery = "insert into youtube.youtubepojo values(?,?,?,?,?)";
		
		List<Object[]> parameter  = new ArrayList();
		
		for(YoutubePojo u : po) {
			
			Object[] pdata = {u.getYouId(), u.getYouName(),u.getYouChanalName(),u.getYouIncome(),u.getYoufollowers()};
			parameter.add(pdata);
			
		}
		
		int[] row = templete.batchUpdate(insertQuery, parameter);
		System.out.println("row effected : "+ row);
		
		
		System.out.println("Dao Completed..");		
	}
	
	
//	Using JDBC Templete ......
	
	
//	Save...
	
	public void savein(YoutubePojo poj) {
		System.out.println("Dao Operation Started..");
		String str = ("insert into  youtube.youtubepojo  values(?,?,?,?,?)");
		int rowInsert = templete.update(str, poj.getYouId(), poj.getYouName(), poj.getYouChanalName(), poj.getYouIncome(), poj.getYoufollowers());
		System.out.println("One Row Effected : "+rowInsert);
		
		System.out.println("Dao Operation Completed..");
	}
	
//	Update...
	
	public void updateop (int youId, double youIncome,int youFollowers) {
		System.out.println("Dao Operation Started..");
		String up = "update youtube.youtubepojo set youIncome=?, youfollowers=? where youId = ?";
		int rowUp = templete.update(up ,youId, youIncome,youFollowers);
		System.out.println("One Row Effected : "+rowUp);

		System.out.println("Dao Operation Completed..");

	}
	
//	Delete...
	
	public void delete (int youId) {
		System.out.println("Dao Operation Started..");
		String up = "delete from youtube.youtubepojo where youId = ?";
		int rowDow = templete.update(up ,youId);
		System.out.println("One Row Effected : "+rowDow);

		System.out.println("Dao Operation Completed..");

	}
	
//	getById...
	
	public void getById (int youId) {
		System.out.println("Dao Operation Started..");
		String getBy = "select youName from youtube.youtubepojo where youId = ?";
		String rowGet = templete.queryForObject(getBy, String.class,youId);
		System.out.println(rowGet);

		System.out.println("Dao Operation Completed..");

	}
	
//	getById entair row...
	
	public void getByIdEntairRow (int youId) {
		System.out.println("Dao Operation Started..");
		String getByRow = "select * from youtube.youtubepojo where youId = ?";
		YoutubePojo rowGet = templete.queryForObject(getByRow,new BeanPropertyRowMapper<YoutubePojo>(YoutubePojo.class),youId);
		System.out.println(rowGet);

		System.out.println("Dao Operation Completed..");

	}
	
//	getAll entair row...
	
	public void getAll () {
		System.out.println("Dao Operation Started..");
		String getBy = "select * from youtube.youtubepojo";
		List<YoutubePojo> rowGet = templete.query(getBy,new BeanPropertyRowMapper<YoutubePojo>(YoutubePojo.class));
		
		for(YoutubePojo u : rowGet) {
			System.out.println(u);

		}

		System.out.println("Dao Operation Completed..");

	}


}
