package own;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="race";
		String text2="care";
		
		char[]Array1=text1.toCharArray();
		char[]Array2=text2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
	
				
				boolean result = Arrays.equals(Array1, Array2);
			
			
		
		if (result) {
			System.out.println("it contains the same word");
			
		}
		else {
			System.out.println("it doesnt contain the same word");
		}
	}

}
