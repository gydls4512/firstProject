import java.util.Scanner;

public class whileExample5 {
	public static void main(String[] args) {
		// 임의의 수 => 가위, 바위, 보
		int ran = (int) (Math.random() *3);
				
				String rsp = "";
				if (ran == 0) {
					rsp = "가위";
				} else if (ran == 1) {
					rsp = "바위";
				}else if (ran == 2) {
					rsp = "보";
				}
				
		Scanner scn = new Scanner(System.in);
		System.out.println("가위,바위,보 >>>>");
		String str = scn.nextLine();
		
		// 조건문... 컴퓨터 가위/바위/보 <=> 내 가위,바위,보
		// You wim..
		// you lose
		// same same
		
		
	    if (rsp.equals(str)) {
	    	System.out.println("same");
	    	
		
		
	}

}
