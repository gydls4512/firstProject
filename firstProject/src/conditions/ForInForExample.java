package conditions;

public class ForInForExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) { // 그룹안에서 같은 i 쓰지 못함
				System.out.print("*");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
			
				// ln없애면 결과물 가로로 펼쳐짐
				//

			}
			System.out.println();
		}

	}

	public static void ex1() {
		  for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) { // 그룹안에서 같은 i 쓰지 못함
					System.out.print("i의 값: " + i + " j의 값: " + j + "\t");
					// ln없애면 결과물 가로로 펼쳐짐
					//

				}
				System.out.println();
			}
		
	}
}
