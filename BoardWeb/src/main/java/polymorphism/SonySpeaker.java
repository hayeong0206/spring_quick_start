package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonnySpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("SonnySpeaker---소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SonnySpeaker---소리 내린다.");
	}
}