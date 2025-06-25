package classTest;

public class A {
	int data; // 클래스 안에서 사용할 수 있는 전역 변수 = 필드, 멤버
	
//	기본 생성자 (메모리에 할당시켜야되니까), 건들면 안되기 때문에 ;(종료)로 닫아놓음.
	public A() {;}
	
//	값을 초기화 시키기 위한 생성자 (초기 생성자)
//	클래스 이름과 똑같이 생성 = 생성자 A
	public A(int data) {
		this.data = data; // this : a라면 100번지, b라면 200번지 값 넣어줌 ..
	}
	
	void printData() {
		System.out.println(this); // 주소값
		System.out.println(this.data); // 각 주소의 데이터 출력
	}
	
	// static : 컴파일러가 static이 붙어있는 메서드, 변수들을 메모리 상에 가장 먼저 올려줌, 클래스 없이도 접근 가능해짐
	public static void main(String[] args) { 
//		객체화
		A a = new A(10); 
		A b = new A(20); 
		System.out.println(a.data);
		System.out.println(b.data);
		a.printData();
		b.printData();
	}
	
}
