package com.stackroute.pe5main;

import java.util.Comparator;

public class StudentSorter implements Comparator<StudentClass> {
	 public int compare(StudentClass s1, StudentClass s2) {
		 if(s1.getAge() == s2.getAge() && s1.getName().equals(s2.getName()))
				 return (s1.getStudentId()-s2.getStudentId())*-1;
		 else if(s1.getAge() == s2.getAge()) 
			 return s2.getName().compareTo(s1.getName());
		 else
			 return (s1.getAge()-s2.getAge())*-1;
	 }
	
}