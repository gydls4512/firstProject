package co.yedam.pilates;

import java.util.Scanner;

public class PilatesApp {

	static Member[] members = new Member[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 9.종료
		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
			} else if (menu == 3) {
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료되었습니다.");
	} // end of main()
	
public static void memberUpdate("회원번호를 입력하세요>>>") {
		try {
		
	}

	public static void searchByName() {
		String name = scanString("조회할 이름을 입력하세요>>> ");
		boolean exist = false; // 회원정보가 있는 지 체크.
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("해당 이름이 없습니다.");
		}
	}

	public static void memberList() {
		boolean exist = false; // 회원정보가 있는 지 체크.
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // null인 아닌 경우만 출력...
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("회원정보가 없습니다.");
		}
	}

	public static void memberAdd() {
		String name = scanString("이름을 입력 >>> ");
		String phone = scanString("연락처를 입력 >>> ");
		String birth = scanString("생일을 입력 >>> ");
		Gender gender = scanGen("성별을 입력(1:남, 2:여) >>> ");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비워져 있는 곳에 입력.
				members[i] = member;
				System.out.println("1건 입력되었습니다.");
				break;// 비워있는 위치에 한건 입력 후 종료.
			}
		}

	} // add

	public static String scanString(String arg) { // 입력메세지 출력 후 문자입력값을 반환.
		System.out.print(arg);
		String val = scn.nextLine();
		return val;
	}

	public static Gender scanGen(String arg) { // 입력메세지 출력 후 Gender 반환.
		Gender gender = null;
		while (true) {
			try {
				System.out.print(arg);
				int gen = scn.nextInt(); // 에외가 발생하면 에러메세지 출력 후 다시 입력 메세지.
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2 입력하세요.");
					continue; // 반복문 탈출 못하도록...
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}

		}
		return gender;
	}

	public static int getNextId() {
		// 회원번호 가입순번 => 1, 2, , 5,6,7 ...
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;

		return memberId;
	}

	public static void showMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.입력 2.수정 3.삭제 4.회원리스트 5.이름조회 9.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택> ");
	}
}
