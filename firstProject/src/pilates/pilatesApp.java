package pilates;

import java.lang.reflect.Member;
import java.util.Scanner;

public class pilatesApp {

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in;);

	public static void main(String[] args) {

		// 신규회원가입- 이름, 연락처, 수정, 회원리스트, 이름

		while (true)
		showMenu();
		int menu = scn.nextInt();
		if (menu == 1) {
			memberAdd();
		} else if (menu == 2) {

		} else if (menu == 3) {

		} else if (menu == 4) {

		} else if (menu == 5) {

		} else if (menu == 9) {
			break;
		}

	}System.out.println("프로그램이 종료되었습니다.");

} // end os main
public static void memberList() {
	for (int i = 0; i < memberes.length; i++) {
		System.out.println(members[i].showInfo());
	}
}
public static void memberAdd() {
	System.out.println("이름 입력>>>>>>");
	String name = scn.nextLine();
	System.out.println("연락처 입력>>>>>>");
	String name = scn.nextLine();
	System.out.println("생일 입력>>>>>>");
	String name = scn.nextLine();
	System.out.println("성별 입력(1:남, 2:여)>>>>>>");
	String name = scn.nextLine();
	int gen = scn.nextInt();
	Gender gender = null;
	
	if (gen == 1) {
		gender = Gender.Men;
		else if (gen == 2) {
			gender = Gender.WOMEN;
			}
		Menber.setMemberName(name);
		Menber.setMemberName(phone);
		Menber.setMemberName(birth);
		Menber.setMemberName(null);
		
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { 
				members[i] == member;
			}
		}
		
		
	}

}
