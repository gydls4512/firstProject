package referece;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 33, 22, 17 };
		System.out.println("배열크기: " + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11;
		int sum = 0;
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값:" + intAry[i]);
			sum = sum + intAry[i];
			if (intAry[i] > maxValue) {
				maxValue = intAry[i];
				// maxValue에 배열의 각 요소와 비교 후 큰 값을 maxValue에 대입.

			}
			// System.out.println("합계: " + sum);
			// System.out.println("가장 큰값: " + maxValue);

			// double[] ablAry = { 1.0, 2.0, 3.0 };
			// Strings[] names = { "hong", "kim", "park" };
			// names[0] = "hong";
			// 향상된 for문
			// for (String name : names) {
			// System.out.println(name);
			// }

		}
	}
}
