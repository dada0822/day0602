package day0602;

public class CarMain {

	public static void main(String[] args) {
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Vehicle b2 = t.getVehicle();
		b2.run(55,33);
		
		b.run(100, 200);
		t.run(200, 300);
		
		Driver d = new Bus(); // 다형성
		
//		d.stop(); 에러
		
		b.stop();
		t.stop(new Taxi());
		
		// 다형성
		Driver d1 = new Bus();
		d1.checkPass();
		
		Driver d2 = new Taxi();
		d2.checkPass();
		
	}

}
