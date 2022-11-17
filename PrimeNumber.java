package own;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=137;
		int count=0;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
			count++;
			
		}
			
		
	if(count>1) {
		System.out.println("not a prime number");
		
			
		}
	else {
		System.out.println("A prime number");
	}
		}
	}
}




