package Week2.day1;

import java.util.Iterator;
public class EwordsRepeat {
	public static void main(String[] args) {
		String name="we learn java in the first week of the class";
		char[]Stringname=name.toCharArray();
		int count=0;
		for (int i = 0; i < Stringname.length; i++) {
			if(Stringname[i]=='e') {
				count++;
				
			
		}
			
		}
		System.out.println(count);
	}
}


