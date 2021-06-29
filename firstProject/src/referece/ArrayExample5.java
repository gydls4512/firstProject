package referece;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[5];
		names[0] = "Hong"; //첫번째
		names[1] = "Hwang";
		names[2] = "Park";
		names[3] = "Kim";
		names[4] = "Choi";
		
		// Hong Enter => 첫번째 위치에 있습니다.
		// quit enter => 프로그램 종료.
		// Lee Enter => 이런 이름은 없습니다.
		
		while (true) {
			System.out.println("이름을 입력>>>>");
			String input = scn.nextLine();
			if (input.equals( "quit")) {
				break;
			}
			// 입력한 값이랑 배열에 들어있는 값을 비교.. 몇번째입니다
		}
     for(int i=0; i<names.length; i++)
		if (input.out.printle("Hong")) {
    	 System.out.println("첫번쩨 위치에 있습니다");
     }

}

}