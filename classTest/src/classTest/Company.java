package classTest;

public class Company {
	
//	회사 클래스 필드 구성하기
//	이름, 나이, 수입
//	회사의 총 수입
//	회사원은 총 4명
	String name;
	int age;
	int income;
	static int total;
	
//	기본 생성자
	public Company() {;}
	
//	생성자 생성 (초기화)
//	this.name = name;이라고 작성하면, 현재 객체(즉, Company 클래스의 인스턴스)의 name 필드에 매개변수 name 값을 할당
	public Company(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	
	public static void main(String[] args) {
//	1번 +10000원
//	2번 +1000원
//	3번 +2000원
//	4번 -20000원
//	각 회사의 총 수입을 출력하기
		Company employee1 = new Company("서민아", 20);
		Company employee2 = new Company("홍길동", 30);
		Company employee3 = new Company("장보고", 35);
		Company employee4 = new Company("이순신", 40);
		
		employee1.income += 10_000; // income은 instance 변수이기 때문에 객체를 통해 접근
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 20_000;
		
		Company.total += employee1.income; // total은 static 변수이기 때문에 클래스명에 바로 접근 가능
		Company.total += employee2.income;
		Company.total += employee3.income;
		Company.total += employee4.income;
		
		System.out.println(Company.total);
	}

}

////회사 클래스 필드 구성하기
////이름, 나이, 수입
////회사의 총 수입
//static int money; // 회사마다 같은 값을 사용해야 되기 때문에
//String name;
//int age;
//int income;
//
////기본 생성자
//public Company() {;}
//
////생성자 (초기화)
//public Company(String name, int age) {
//	this.name = name;
//	this.age = age; 
//}

//public static void main(String[] args) {
////회사원은 총 4명
////1번 +10000원
////2번 +1000원
////3번 +2000원
////4번 -20000원
////각 회사의 총 수입을 출력하기
//	Company employee1 = new Company("홍길동", 20);
//	Company employee2 = new Company("장보고", 30);
//	Company employee3 = new Company("이순신", 25);
//	Company employee4 = new Company("김유신", 35);
////	System.out.println(employee1.name);
//	
//	employee1.income += 10_000; // , 대신 _사용 (int)
//	employee2.income += 1_000;
//	employee3.income += 2_000;
//	employee4.income -= 2_0000;
//	
//	Company.money += employee1.income;
//	Company.money += employee2.income;
//	Company.money += employee3.income;
//	Company.money += employee4.income;
//	
//	
//	System.out.println(Company.money);



