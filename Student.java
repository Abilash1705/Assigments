package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentname"+"="+"Abilash");
	}
	public void studentDept() {
		System.out.println("studentdept"+"="+"bsc-IT");
	}
	public void studentId() {
		System.out.println("studentid"+"="+"170501");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		System.out.println(stu);
	}

}
