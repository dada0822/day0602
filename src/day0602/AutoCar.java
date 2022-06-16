package day0602;

//자동차 제조사의 구현 부분
public class AutoCar implements OperateCar {

	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
	}
	
	public void turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "도 만큼 회전합니다.");
	}
	
}
