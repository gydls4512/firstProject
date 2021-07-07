package co1;

public interface FreiendAccess {
	// 동일한 이름의 친구는 없다.
	// 입력 수정 삭제 리스트 이름조회 전화번호 조회
	public void insert(Friend friend);
	
	public void update(Friend friend);
	
	public void delete(Sreing name);
	
	public friend[] selectAll();
	
	
	

}
