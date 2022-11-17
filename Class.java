package org.college;

import org.student.Student;

public class Class extends Student {
	public void collegeName() {
		System.out.println("vels university");
	}
	public void collegeCode() {
		System.out.println("600114");
	}
	public void collegeRank() {
		System.out.println("second");
	}
	public static void main(String[] args) {
		Class clg=new Class();
		clg.deptName();
		clg.studentName();
		clg.studentId();
		clg.studentDept();
		clg.collegeRank();
		clg.collegeName();
		clg.collegeRank();
		System.out.println(clg);
	}

}
