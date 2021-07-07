package co1.friend.view;

public class friendCliApp {
	
	public void start() {
		//1.입력 2.수정 3.삭제 4.리스트 5.이름조회 6전화번호조회 9.종료
		int menu = 0;
		do {
		
		menuTitle();
		
	}
	
	public void menuTitle() {
		System.out.println("====친구 관리====");
		System.out.println("| 1. 친구추가  |");
		System.out.println("| 2. 친구수정  |");
		System.out.println("| 3. 친구삭제  |");
		System.out.println("| 4. 전체조회  |");
		System.out.println("| 5. 이름조회  |");
		System.out.println("| 6. 전화조회  |");
		System.out.println("| 9. 종료  |");
	}
}
