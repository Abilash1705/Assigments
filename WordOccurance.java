package own;

public class WordOccurance {
	public static void main(String[] args) {
		String text="welcome to chennai";
		char[] name=text.toCharArray();
		int count=0;
		
		for (int i = 0; i < name.length; i++) {
			if (name[i]=='e') {
				count=count+1;
				
			}
			
		}
		System.out.println("total num of word=="+count);
	}

}
