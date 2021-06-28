package conditions;

public class ForExample4 {
	public static void main(String[] args) {
		forSum();
	}

	private static void whileSum() {
		// while 구문 1~10의 합
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}

		System.out.println("1~10 까지 짝수합:" + sum);

	}

	private static void forSum() {

// 1부터 10까지 i 변수를 활용
// int sum = 0
// 1~10까지 합 : 55

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				
			}
		}System.out.println("sum>:" + sum);
	}
}
