
public class ForExample3 {
	public static void main(String[] args) {
		// 1~50까지 수 중에서 2 또는 3의 배수의 합
		
		int sum = 0;
	for(int i =1; i <=50; i++) {
		System.out.println(i);
		
		if (1 % 2 == 0 || i % 3 == 0)
			sum = sum + i;
		System.out.println("i :" + i + ", sum: " + sum);
	}	
	}
			System.out.println("현재" + sum); 
		}
}
		

	
