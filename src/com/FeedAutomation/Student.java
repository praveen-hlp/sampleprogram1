package com.FeedAutomation;

public class Student {
	private static int studentid;
	public static void main(String[] args) {
		System.out.println("HEllo");
		Student.studentid = 34;
		System.out.println(Student.getStudentid());
		
	}
	public static int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		Student.studentid = studentid;
	}
}
