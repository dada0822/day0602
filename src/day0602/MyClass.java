package day0602;

public class MyClass {

	// 1. 인터페이스가 필드 타입으로 사용되는 경우
	//	필드에 객체를 대입하여 사용 가능
	RemoteControl rc = new Television();
	
	MyClass(){} // 기본 생성자
	
	// 2. 인터페이스를 생성자의 매개변수 타입으로 사용
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 3. 인터페이스를 지역변수타입으로 사용
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
	}
	
	// 4. 인터페이스를 메서드의 매개변수로 사용
	void methodB(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(6);
	}

}
