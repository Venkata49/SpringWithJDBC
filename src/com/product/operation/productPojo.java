package com.product.operation;

import org.springframework.stereotype.Component;

@Component
public class productPojo {

	private int productId;
	private String productName;
	private double productPrice;
	private double productGst;
	private String productModel;
	
	
//	Constructors...
	
	public productPojo(int productId, String productName, double productPrice, double productGst, String productModel) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productGst = productGst;
		this.productModel = productModel;
	}
	public productPojo() {
		super();
	}
	
//	toString()...
	
	@Override
	public String toString() {
		return "productPojo [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productGst=" + productGst + ", productModel=" + productModel + "]";
	}
	
	
	
//	getters and setters....
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductGst() {
		return productGst;
	}
	public void setProductGst(double productGst) {
		this.productGst = productGst;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
		
	
}
