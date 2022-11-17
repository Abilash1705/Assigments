package org.department;

public class Department {
	public void deptName() {
		System.out.println("deptName"+"="+"bsc-IT");
	}
	public static void main(String[] args) {
		Department dept=new Department();
		dept.deptName();
		System.out.println(dept);
	}

}
