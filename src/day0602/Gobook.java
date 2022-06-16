package day0602;

public class Gobook extends Character {

	public Gobook() {
		hp = 40;
		energy = 50;
		System.out.println("꼬부기가 생성되었습니다!");
		printInfo();
	}

	@Override
	public void eat() {
		energy+=15;
	}

	@Override
	public void sleep() {
		energy+=10;
	}

	@Override
	public boolean play() {
		energy-=30;
		hp+=15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy-=20;
		hp+=30;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(hp >= 50) {
			level++;
			hp-=50;
		}
	}
	
}