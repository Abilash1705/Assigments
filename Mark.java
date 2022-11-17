package Week4.Day2;

public class Mark implements Whatsapp{

	public void voicenote() {
		// TODO Auto-generated method stub
		System.out.println("send voice note");
	}

	public void videocall() {
		// TODO Auto-generated method stub
		System.out.println("make videocall");
	}

	public void sendimage() {
		// TODO Auto-generated method stub
		System.out.println("sendimage");
	}
public static void main(String[] args) {
	Whatsapp zuck=new Mark();
	zuck.sendimage();
	zuck.videocall();
	zuck.voicenote();
	System.out.println(zuck);
}
}

