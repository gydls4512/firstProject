package pilates;

public class member {

		private int memberId;
		private String memberPhone;
		private String memberBirth;
		private Gender memberGen;
		
		
		
		
		public int getMemberId() {
			return memberId;
		}
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}
		public String getMemberPhone() {
			return memberPhone;
		}
		public void setMemberPhone(String memberPhone) {
			this.memberPhone = memberPhone;
		}
		public String getMemberBirth() {
			return memberBirth;
		}
		public void setMemberBirth(String memberBirth) {
			this.memberBirth = memberBirth;
		}
		public String getMemberGen() {
			return memberGen;
		}
		public void setMemberGen(String memberGen) {
			this.memberGen = memberGen;
		}

		public String showInfo() {
			string info = "회원번호: "+memberId+ "회원이름: ??" 연락처: ?? 생년월일: ?? 성별: ??" ;
			return info;
		}
		
		
	}


