package Week2.day1;



public class UsingCharAt {
	public static void main(String[] args) {
		String text="Good Morning";
		char[]charArray=text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char charAt=text.charAt(i);
			System.out.println(charAt);
			
			
		}
	}

}
