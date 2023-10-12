package polymorphism;

public class TvUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		//LgTV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
