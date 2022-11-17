package own;

public class StringReverse {
	   public static void main(String[] args) {

	        String text="4563bnidfb";
	        char[] array = text.toCharArray() ;
	   
	        for(int i = array.length-1;i>=0;i--) {
	        	System.out.print(array[i]);
	        }
	        
	        }
	}
