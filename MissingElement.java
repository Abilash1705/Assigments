package own;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,7,8,9,10};
		Arrays.sort(array);
		Set<Integer>num=new TreeSet<>();
		
		for(int i=0;i<array.length;i++) {
			int j=i+1;
			if(j!=array[i]) {
				System.out.println(j);
				break;
	}

}
}
}