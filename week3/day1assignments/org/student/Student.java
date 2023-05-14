package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName(String name) {
		System.out.println("Student name :"+name);
	}
	public void studentDept(String dept) {
		System.out.println("Student Department :"+dept);
	}
	
	public void studentId(int SID) {
		System.out.println("Student ID :"+SID);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	        Student student = new Student();

	        student.collegeName("xxxx");
	        student.collegeCode(1234);
	        student.collegeRank(2);
	        student.deptName("IT");
	        student.studentName("Sharadha");
	        student.studentDept("IT");
	        student.studentId(244);
	}

}
/*
Package   :org.college
Class     :College
Methods   :collegeName(),collegeCode(),collegeRank()

Package   :org.department
Class        :Department
Methods   :deptName()

Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance*/
