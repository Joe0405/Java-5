package com.stackroute.pe5test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.pe5main.StudentClass;
import com.stackroute.pe5main.StudentSorter;

public class TestStudentClass {
	ArrayList<StudentClass> students = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		students.add(new StudentClass(111, "Joe", 23));
		students.add(new StudentClass(112, "Sharoon", 24));
		students.add(new StudentClass(113, "Joe", 23));
		students.add(new StudentClass(114, "Rajat", 25));
		students.add(new StudentClass(115, "Vikram", 24));
	}

	@After
	public void tearDown() throws Exception {
		students = null;
	}

	@Test
	public void test() {
		Collections.sort(students, new StudentSorter());
		assertEquals("[StudentClass [studentId=114, name=Rajat, age=25], StudentClass [studentId=115, name=Vikram, age=24], StudentClass [studentId=112, name=Sharoon, age=24], StudentClass [studentId=113, name=Joe, age=23], StudentClass [studentId=111, name=Joe, age=23]]",students.toString());
		System.out.println(students);
	}

}
