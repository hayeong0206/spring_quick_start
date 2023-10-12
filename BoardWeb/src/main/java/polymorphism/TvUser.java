package polymorphism;

public class TvUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		//사용할 TV 객체 획득 arguments에 매개변수 입력 후 실
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
