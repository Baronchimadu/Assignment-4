package com.coderscampus;

public class Main {
	private String classes;
	private String levelOfEducation;
	
	//private void giveARaise  () {
		//System.out.println("Teacher gets a raise!");
	
//	public void teach  () {
		//System.out.println("Teacher gets a raise!");
	
	
	public Main() {
		
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	} 
	public String getLevelOfEduction() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
}
