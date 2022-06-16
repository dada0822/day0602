package day0602;

public abstract class Character { // 접근제어자 제일 앞에 써주는 게 좋음

	protected int hp;
	protected int level = 0;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	public boolean checkEnergy() {
		if(energy <= 0) {
			return true;
		}
		return false;
	}
	
	public void printInfo() {
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("hp : " + hp);
		System.out.println("energy : " + energy);
		System.out.println("level : " + level);
	}
	
}