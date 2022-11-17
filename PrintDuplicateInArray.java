package Day4;

public class PrintDuplicateInArray {
	public static void main(String[] args) {
		int[]Array= {12,95,6,4,6,4,21,51,95,66};
		for (int i = 0; i < Array.length; i++) {
			for (int j = i+1; j < Array.length; j++) {
				if(Array[i]!=Array[j]);
				System.out.println(Array[i]);
				
			}
			
		}
	}

}
