package day0602;

public class MyClassMain {

	public static void main(String[] args) {
		
		// 1)
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(3);

		System.out.println("--------------");
		
		// 2)
		MyClass mc2 = new MyClass(new Audio());
		
		System.out.println("--------------");
		
		// 3)
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("--------------");
		
		// 4)
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
	}

}
