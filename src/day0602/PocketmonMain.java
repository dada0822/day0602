package day0602;

import java.util.Scanner;

abstract class Pocketmon {
	int hp;
	int energy;
	int level = 1;
	
	abstract void eat();
	abstract void sleep();
	abstract void playing();
	abstract void practice();
	abstract void levelUp();
	void energyCheck() {
		if(energy <= 0) {
			System.out.println("포켓몬이 쓰러졌습니다..");
		}
	} // 0되면 죽는
	void info() {
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("hp : " + hp);
		System.out.println("energy : " + energy);
		System.out.println("level : " + level);
	} // 정보 출력
	
}

class Pikachu extends Pocketmon {
	
	Pikachu(){
		hp = 30;
		energy = 50;
	}
	
	public String toString() {
		return "피카츄";
	}
	
	void eat() {
		this.energy+=10;
		
	};
	
	void sleep() {
		this.energy+=5;
	};
	
	void playing() {
		this.hp+=5; 
		this.energy-=20;
	};
	
	void practice() {
		this.hp+=20;
		this.energy-=15;
	};
	
	void levelUp() {
		if(hp >= 40) {
			this.hp = 0;
			this.level++;
			System.out.println("피카츄 레벨업");
		}
	};
}

class Squirtle extends Pocketmon {
	Squirtle(){
		hp = 30;
		energy = 50;
	}
	
	public String toString() {
		return "꼬부기";
	}
	
	void eat() {
		this.energy+=10;
	};
	
	void sleep() {
		this.energy+=5;
	};
	
	void playing() {
		this.hp+=5; 
		this.energy-=20;
	};
	
	void practice() {
		this.hp+=20;
		this.energy-=15;
	};
	
	void levelUp() {
		if(hp >= 40) {
			this.hp = 0;
			this.level++;
			System.out.println("꼬부기 레벨업");
		}
	};
}

class Bulbasaur extends Pocketmon {
	Bulbasaur(){
		hp = 30;
		energy = 50;
	}
	
	public String toString() {
		return "이상해씨";
	}
	
	void eat() {
		this.energy+=10;
	};
	
	void sleep() {
		this.energy+=5;
	};
	
	void playing() {
		this.hp+=5; 
		this.energy-=20;
	};
	
	void practice() {
		this.hp+=20;
		this.energy-=15;
	};
	
	void levelUp() {
		if(hp == 40) {
			this.hp = 0;
			this.level++;
			System.out.println("이상해씨 레벨업");
		}
	};
}

public class PocketmonMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Pocketmon[] pocketmons = {new Pikachu(), new Squirtle(), new Bulbasaur()};
		
		System.out.println("원하는 캐릭터를 선택하세요.");
		System.out.println("1.피카츄 2. 꼬부기 3. 이상해씨");
		
		int num1 = s.nextInt();
		System.out.println("-------------------");
		
		System.out.println(pocketmons[num1-1] + "를 선택하였습니다.");
		pocketmons[num1-1].info();
		
		
		end : while (true) {
			System.out.println("-------------------");
			System.out.println("1.밥먹기 2.잠자기 3.놀기 4.연습하기 5.종료");
			int num2 = s.nextInt();
			
			switch(num2) {
			case 1:
				System.out.println("밥을 먹어요!");
				pocketmons[num1-1].eat();
				pocketmons[num1-1].info();
				break;
			case 2:
				System.out.println("잠을 자요!");
				pocketmons[num1-1].sleep();
				pocketmons[num1-1].info();
				break;
			case 3:
				System.out.println("놀아요!");
				pocketmons[num1-1].playing();
				pocketmons[num1-1].info();
				break;
			case 4:
				System.out.println("연습을 해요!");
				pocketmons[num1-1].practice();
				pocketmons[num1-1].info();
				break;
			case 5:
				System.out.println("프로그램 종료 !");
				break end;
			default:
				System.out.println("숫자를 잘못 입력했습니다! 다시 입력하세요!");
				break;		
			}
			
			if (pocketmons[num1-1].energy <=0) {
				pocketmons[num1-1].energyCheck();
				break;
			}
			
			if (pocketmons[num1-1].hp >= 40) {
				pocketmons[num1-1].levelUp();
			}
		}
		
		s.close();
		
	}

}
