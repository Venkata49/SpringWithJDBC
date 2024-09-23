package com.socialmedia;

import org.springframework.stereotype.Component;

@Component
public class YoutubePojo {
	
	private int youId;
	private String youName;
	private String youChanalName;
	private double youIncome;
	private int youfollowers;
	
//	toString()...
	
	@Override
	public String toString() {
		return "YoutubePojo [youId=" + youId + ", youName=" + youName + ", youChanalName=" + youChanalName
				+ ", youIncome=" + youIncome + ", youfollowers=" + youfollowers + "]";
	}
	
	
//	Constructors...
	
	public YoutubePojo() {
		super();
	}

	public YoutubePojo(int youId, String youName, String youChanalName, double youIncome, int youfollowers) {
		super();
		this.youId = youId;
		this.youName = youName;
		this.youChanalName = youChanalName;
		this.youIncome = youIncome;
		this.youfollowers = youfollowers;
	}
	
	
//	Setters and Getters ...
	
	public int getYouId() {
		return youId;
	}
	public void setYouId(int youId) {
		this.youId = youId;
	}
	public String getYouName() {
		return youName;
	}
	public void setYouName(String youName) {
		this.youName = youName;
	}
	public String getYouChanalName() {
		return youChanalName;
	}
	public void setYouChanalName(String youChanalName) {
		this.youChanalName = youChanalName;
	}
	public double getYouIncome() {
		return youIncome;
	}
	public void setYouIncome(double youIncome) {
		this.youIncome = youIncome;
	}
	public int getYoufollowers() {
		return youfollowers;
	}
	public void setYoufollowers(int youfollowers) {
		this.youfollowers = youfollowers;
	}
	

}
