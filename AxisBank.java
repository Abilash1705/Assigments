package OOPS;

public class AxisBank extends Bankinfo {
	public void deposit() {
		System.out.println("deposit"+"="+"50000");
		
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.Saving();
		bank.fixed();
		bank.fixed();
		bank.deposit();
		System.out.println(bank);
	}

}
