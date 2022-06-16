package day0602;

//다중 상속
public class Bus extends Driver implements Vehicle {

	@Override
	public void stop(Vehicle v) {
		System.out.println(v + "정류장에 멈춥니다.");
	}

	// 오버로딩
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
	
	@Override
	public void run(int x, int y) {
		System.out.println(x + ", " + y + " 위치로 버스가 달립니다.");
	}

	public String toString() {
		return "A";
	}
	
}
