package OOPS;

public class Bankinfo {
	public  void Saving(){
		System.out.println("Savings Account"+ "="+ 5000);
		
		
	}
	public void fixed() {
		System.out.println("fixed"+"="+"20000");
	}
	public void deposit() {
		System.out.println("deposit"+"="+"30000");
	}
	public static void main(String[] args) {
		Bankinfo info=new Bankinfo();
		info.deposit();
		info.fixed();
		info.Saving();
		System.out.println(info);
	}

}
