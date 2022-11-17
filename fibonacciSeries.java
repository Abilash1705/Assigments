package day3;

public class fibonacciSeries {
	public static void main(String[] args) {
		int m1=1;
		int m2=2;
		int m3;
		System.out.println(m1);
		System.out.println(m2);
		for (int i = 1; i <=9; i++) {
			m3=m1+m2;
			System.out.println(m3);
			m1=m2;
			m2=m3;
			
			
		}
		
		}
	
		
	}
