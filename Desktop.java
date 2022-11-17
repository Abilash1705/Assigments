package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("16.5 inch");
	}
	public static void main(String[] args) {
		Desktop dis=new Desktop();
		dis.ComputerModel();
		dis.desktopSize();
		System.out.println(dis);
	}

}
