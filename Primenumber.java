package day3;

public class Primenumber {
	public static void main(String[] args) {
		int n=13;
		int count=0;
	
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				count++;
			}
		
			
		}
		if (count>0) {
			System.out.println("The Number is not Prime");
		}
		else {
			System.out.println("The Number is Prime");
		}
		
	}

}
