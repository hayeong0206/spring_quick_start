package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	//생성자 인젝션 이용
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체생성");
		this.speaker = speaker;
	}
	//SamsungTV클래스에 생성자 추가
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeUp();
	}
}
