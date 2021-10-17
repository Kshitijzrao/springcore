package com.springcore.springcore;

public class Student {
	private int studentId;
	private String stdentName;
	private String studentAddress;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int studentId, String stdentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.stdentName = stdentName;
		this.studentAddress = studentAddress;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStdentName() {
		return stdentName;
	}
	public void setStdentName(String stdentName) {
		this.stdentName = stdentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stdentName=" + stdentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
}
