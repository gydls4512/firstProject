package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1,2,3을 생성
		// 사용자 값을 입력. 2 입력
		// 임의의 값 = 사용자 입력값
		// 정답입니다. 틀렸습니다.

		int val = (int) (Math.random() * 3 + 1);
		System.out.println("사용자값 입력");

		Scanner scanner = new Scanner(System.in);
		System.out.println("1,2,3");
		int val2 = scanner.nextInt();
		System.out.println("2" + val);
		if (val2 == val)
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");

	}

}
