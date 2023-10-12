package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	//samsungTV 클래스의 볼륨 조절 기능을 SonySpeaker가 이용하도록 수정
}
