package co.yedam;
// 1~31
		// 1 2 3 4 5 6 7 
		// 8 9 10 11 12 13 14
		// 15 16 17 18 19 20 21
		// 22 23 24 25 26 27 28
		// 29 30 31
public class calExample {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance; // new Calendar();
System.out.println("년도: " + cal.get(Cal.get(Calendar.YEAR));
System.out.println("월: " + cal.get(Calendar.MONTH) + 1));
System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));	
System.out.println("일: " + cal.get(Calendar.DAY_OF_WEEK));

		String[] days = {"Sun","Sun","tue", "Wed", "Thr", "Fri", "Sat" };
		// 요일정보 : 획장 for
			for (String day : days) {
				System.out.println(" " + day);
			}
		for (int i = i; i <= 31; i++) {
			System.out.println("%4d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		
	}

}

		
		
	