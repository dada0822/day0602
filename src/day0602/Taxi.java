package day0602;

public class Taxi extends Driver implements Vehicle {

	@Override
	public void stop(Vehicle v) {
		System.out.println("손님이 요청하신 " + v + "에 멈춥니다.");
	}

	// 오버로딩
	public void stop() {
		System.out.println("택시가 멈춥니다.");
	}
	
	@Override
	public void run(int x, int y) {
		System.out.println(x + ", " + y + " 위치로 택시가 달립니다.");
	}

	public String toString() {
		return "B";
	}
	
	Vehicle getVehicle() {
		Bus b = new Bus();
		return b; 
	} // 택시를 통해 버스 생성
	
}
