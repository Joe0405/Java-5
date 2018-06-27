package com.stackroute.pe5main;

import java.util.Comparator;

public class StudentClass {
	private int studentId;
	private String name;
	private int age;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentClass(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentClass [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

