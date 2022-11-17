package Week2.day1;

public class SplitGivenString {
	public static void main(String[] args) {
		String Str="Welcome To Chennai";
		String[] split=Str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println(split.length);
		int count=0;
		for (int i = 0; i < split.length; i++) {
			count++;
			
			
		}
		System.out.println("count"+count);
	}
 
}
