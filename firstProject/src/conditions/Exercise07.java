package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// 간단한 예금출금 프로그램
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("----------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("----------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리");
				System.out.println("금액을 입력>>>>");
				int temp = scn.nextInt();
				balance = balance + temp;
				
				if (balance >= 100000) {

					System.out.println("입금할 수 없습니다");
				} else {
					System.out.println(balance + "원이 입금 되었습니다.");
				
				}	
			} else if (menu == 2) {
				System.out.println("출금처리");
				System.out.println("금액을 입력>>>>");
				int temp = scn.nextInt();
				//잔액보다 큰 금액 출금하려면 안된다고 메세지 넣기 
				if(balance < temp) {
					System.out.println("잔액보다 큰 금액입니다.ㅜㅜ 출금 불가합니다");
				} else {
					balance = balance - temp;
				}
				
			} else if (menu == 3) {
				System.out.println("잔액조회처리");
				System.out.println("현잔액: " + balance);
			} else if (menu == 4) {
				break;

			}
		} // while
		System.out.println("프로그램을 종료합니다.");
	} // main()
}// class
