package day0602;

public abstract class Driver {

	int x, y;
	
	abstract void run(int x, int y);
	
	void checkPass() {
		System.out.println("손님이 탑승합니다.");
	}
	
}
