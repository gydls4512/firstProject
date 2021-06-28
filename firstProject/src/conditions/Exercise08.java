package conditions;

import java.util.Scanner;

public class Exercise08 {

	// 필드..
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;

		}
		return false;
	}

	public static void printMenu() {
		System.out.println("----------------");
		System.out.println("1.예금 2.출금 3.잔액 4.종료");
		System.out.println("----------------");
		System.out.println("선택>");

	}

	public static void deposit() {
		System.out.println("금액을 입력>>>>");
		int temp = scn.nextInt();
		// balance = balance + temp;
		balance = add(balance, temp);

		if (balance >= 100000) {
			System.out.println("입금할 수 없습니다");
		} else {
			System.out.println(balance + "원이 입금 되었습니다.");
		}

	}

	public static void withdraw() {
		System.out.println("금액을 입력>>>>");
		int temp = scn.nextInt();
		// 잔액보다 큰 금액이 출금할 수 없다고 메세지
		if (balance < temp) {
			System.out.println("잔액보다 큰 금액 입니다");
		} else {
			// balance = balance - temp;
			balance = add(balance, -temp);
			System.out.println(balance + "원 출금되었습니다.");
		}
	}

	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}

	public static void main(String[] args) {
		// 간단한 예금출금 프로그램

		boolean run = false;

		do {
			if (!run) {
				// id, password => admin, 1234 누르면 실행, 잘못 누르면 불실행
				System.out.println("id를 입력하세요");
				String id = scn.nextLine();
				System.out.println("pass를 입력하세요");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass);
			}

			// 메뉴출력
			printMenu(); // 메소드 호출

			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리");

			} else if (menu == 2) {
				System.out.println("출금처리");
				withdraw();

			} else if (menu == 3) {
				System.out.println("잔액조회처리");
				System.out.println("현잔액: " + balance);

			} else if (menu == 4) {
				run = false;
			}

		} while (run); // while
		System.out.println("프로그램을 종료합니다.");
	} // main()
}// class
