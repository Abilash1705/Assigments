package Week3.Day1;

public class EmployeeDetails {
	public void EmployeeDetails (int empId) {
		System.out.println(empId);
		}
	public void EmployeeDetails (String empName) {
		System.out.println(empName);
}
	public void EmployeeDetails (double empSalary) {
		System.out.println(empSalary);
}
	public void EmployeeDetails (long empPhoneNumber) {
		System.out.println(empPhoneNumber);
	
}
	public void EmployeeDetails(int empId, String empName, double empSalary, long empPhoneNumber ) {
		System.out.println("empId"+empId+ " "+"empName"+empName+" "+"empSalary"+empSalary+" "+"empPhoneNumber"+empPhoneNumber);
		
	}
	public static void main(String[] args) {
		EmployeeDetails details= new EmployeeDetails();
		details.EmployeeDetails(123456);
		details.EmployeeDetails("abilash");
		details.EmployeeDetails(9552.22);
		details.EmployeeDetails(123456789L);
		
	}
}