package Week3.Day1;

public class Audi extends Car {
	public void applyGear() {
		System.out.println("Apply Gear");
		
	}
	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.applyBreak();
		audi.switchOnAc();
		audi.applyGear();
	}

}
