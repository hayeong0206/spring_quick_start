package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
//클라이언트 요청을 위해 아이디설정
public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("LgTV --- 소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("LgTV --- 소리 내린다.");
	}
}
