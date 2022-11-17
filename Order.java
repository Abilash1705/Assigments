package Day4;

import java.util.Arrays;

public class Order {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		
		Arrays.sort(num);
		for (int i =  num.length-1;i>=0; i--) {
			System.out.println(num[i]);
			
		}
		
	}
  
}
