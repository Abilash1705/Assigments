package week1.day2;

public class MyCar {
	public void applyBrake() {
		System.out.println("applyBrake");
		
	}
public void onAc() {
	System.out.println("onAc");
}
   public void applyAccelarate() {
	   System.out.println("applyAccelarate");
   }
   public void shiftGear() {
	   System.out.println("shiftGear");
   }
   public static void main(String[] args) {
	MyCar testing=new MyCar();
	testing.applyAccelarate();
	testing.applyBrake();
	testing.shiftGear();
	testing.onAc();
	
}


}
