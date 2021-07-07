package co1;

public class friend {
// 구분,이름,연락처
	private String gubun;
	private String name;
	private String tel;
	
	public Friend() {
	}	
	
	
	public friend(String gubun, String name, String tel) {
		super();
		this.gubun = gubun;
		this.name = name;
		this.tel = tel;
	}




	public String getGubun() {
		return gubun;
	}

	@Override
	public String toString() {
		return "friend [gubun=" + gubun + ", name=" + name + ", tel=" + tel + "]";
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
