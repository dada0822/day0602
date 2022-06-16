package day0602;

import java.util.Scanner;

public class PlayGame {

	// 캡슐화
	private Character character;
	private int menu;
	private boolean exit;
	
	public PlayGame(Character character) {
		this.character = character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("--------------------");
		System.out.println("1.밥먹기 2. 잠자기 3.놀기 4.운동하기 5.종료");
		menu = sc.nextInt();
		play();
	}
	
	public void play() {
		switch(menu) {
		case 1:
			System.out.println("밥을 먹어요!");
			character.eat();
			break;
		case 2:
			System.out.println("잠을 자요!");
			character.sleep();
			break;
		case 3:
			System.out.println("놀아요!");
			exit = character.play();
			break;
		case 4:
			System.out.println("운동을 해요!");
			exit = character.train();
			break;
		case 5:
			exit = true;
		}
		character.printInfo();
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
}
