package Day4;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[]Array= {1,2,3,4,5,6,7,8,11,15};
		int n=Array.length+1;
		int sum=(n*(n+1/2));
		for (int i = 0; i < Array.length; i++) {
			sum=sum-Array[i];
			
		}
		System.out.println("Missing number is"+sum);
	}

}
