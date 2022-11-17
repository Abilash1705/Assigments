package own;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumberssss {
	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer>dup=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			for (int j =i+1; j < data.length; j++) {
			
				
				if(data[i]==data[j]) {
					dup.add(data[i]);
				}
			}
			
		}
		System.out.println(dup);
	}

}
