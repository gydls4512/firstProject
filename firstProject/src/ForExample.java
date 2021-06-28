
// for문

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("i :" + i);

			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println("현재 sum :" + sum);
				Thread.sleep(1000);

			} else if (i == 5) {

				System.out.println("최종합계 " + sum);
			}
		}
	}
}
