package operstor;

public class IfExample {
	public static void main(String[] args) {
		// if () {}
		int v1 =10;
		int v2 =20;
		
		if (v1 > v2) {
			System.out.println("v1 이 v2보다 큽니다.");
		} else if (v1==v2) {
			System.out.println("v2과 v1는 같습니다. ");
		} else {
			System.out.println("v2가 v2보다 큽니다.");
		}
		
       String str1 = "홍길동";
       String str2 = "홍길동";
       String str3 = new String("홍길동");
       
       if (str1.equals(str3)) {
    	   System.out.println("같은 이름입니다.");
       } else {
    	   System.out.println("다른 이름입니다.");
       }
       
		System.out.println("end of prog");
	}
 

}
