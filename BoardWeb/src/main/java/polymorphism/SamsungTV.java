package polymorphism;

public class SamsungTV implements TV {
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	//멤버변수에 대한 초기화 작업 처리
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리..");
	}
	//객체를 삭제하기 직전에 호출될 임읭의 메소드 지정
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
		//객체가 언제 생성되는지 알기위함 
	}
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV --- 소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV --- 소리 내린다.");
	}
}
