package referece;

public class ArrayExample6 {
	public static void main(String[] args) {

		int[] scores = { 90, 80, 85 };
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;

		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 20) + 80;
		}

		double avg = 0.0;
		int maxValue = 0;
		int sum = 0;
//코딩

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			} sum = scores[i] + sum;
			
		} 
		avg = sum / 3.0; 

		System.out.println("평균은 " + avg);
		System.out.println("최고점수는 " + maxValue);

	}
}