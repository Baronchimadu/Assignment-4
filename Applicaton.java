package com.coderscampus;

public class Applicaton {
	
	
	public static void main(String[] args) {
		Course1 course1 = new Course1();
		System.out.println(course1.getClasses());
		System.out.println(course1.getLevelOfEduction());
		//course1.teach();
		System.out.println("... rest of lines omitted ... \n");
		
		Course2 course2 = new Course2();
		System.out.println(course2.getClasses());
		System.out.println(course2.getLevelOfEduction());
		//course2. teach();
		System.out.println("... rest of lines omitted ... \n");
		
		Course3 course3 = new Course3();
		System.out.println(course3.getClasses());
		System.out.println(course3.getLevelOfEduction());
		//course3.teach();
		System.out.println("... rest of lines omitted ... \n");
}
}