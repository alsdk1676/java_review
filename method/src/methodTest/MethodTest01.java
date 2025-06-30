package methodTest;


public class MethodTest01 {
//	1~10까지 출력하는 메서드
	void printNum() { // 매개변수 받을 필요 없음
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	
//  이름을 n번 출력하는 메서드
	void printName(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("서민아");
		}
	}
	
	public static void main(String[] args) {
		MethodTest01 mt1 = new MethodTest01();
		mt1.printNum(); 
		mt1.printName(5); 
	}

}
