package referece;

public class ArrayExample3 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 25); // (int) (Math.random() * 25);
		int num2 = (int) (Math.random() * 25);
		int num3 = (int) (Math.random() * 25);

		// 세개의 숫자 중 큰 순으로 값을 파악한 후 배열에 저장
		// 요기에 코드 작성
		// num1 num2 num3

		int[] intAry = new int[3];

		intAry[0] = num3;
		intAry[1] = num1;
		intAry[2] = num2;

		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {

					intAry[0] = num1;
					intAry[1] = num2;
					intAry[2] = num3;

				}

			} else {
				if (num3 > num1) {
					if (num1 > num2) {
						if (num3 > num2) {
						}
					}
				}
				intAry[0] = num3;
				intAry[1] = num1;
				intAry[2] = num2;

			}
		} else {
			if (num2 > num3) {
				if (num3 > num1) {
					if (num2 > num1) {

						intAry[0] = num2;
						intAry[1] = num3;
						intAry[2] = num1;
					}
				}

			}

		}
		for (int n : intAry) {
			System.out.println(n);
		}
	}
}
