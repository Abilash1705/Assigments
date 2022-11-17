package own;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String name="paypal india";
		char[] text=name.toCharArray();
		Arrays.sort(text);
		Set<Character>text1=new TreeSet<>();
		for (int i = 0; i < text.length; i++) {
			text1.add(text[i]);
			
		}
		System.out.println(text1);
	}
}
