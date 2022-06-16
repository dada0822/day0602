package day0602;

	//인터페이스는 상수와 추상메서드로 구성
	// 상수를 표시하는 public static final 예약어는 생략 가능
	// 추상 메서드를 표시하는 public abstract 예약어도 생략 가능
	// 상수 선언과 동시에 값을 초기화해야 함

public interface RemoteControl {

	// public static final int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10; // final 키워드를 생략했지만 인터페이스에는 상수만 올 수 있으니까 대문자로
	public int MIN_VOLUME = 0;
	
	// public abstract void turnOn();
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
