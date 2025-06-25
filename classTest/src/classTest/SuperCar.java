package classTest;

import java.util.Scanner;

// 자동차
public class SuperCar {
//	클래스 필드의 초기화는 컴파일러가 자동으로 해준다.
//	추상화
	String brand; // ""
	String color; // ""
	long price;  // 0L
	boolean engine; // false
	String password; // ""
	int errorCount; // 0
	
//	초기화 블록 (클래스가 생성될 때 초기값을 넣어주기 위해)
	{
		this.password = "0000"; // 내가 원하는 값(0000)으로 초기화 해줌
	}
	
//	static 블록 (객체가 할당됐을 때 반드시 한번 실행)
	static {
		System.out.println("출고 축하드립니다.");
	}
	
//	기본 생성자
	public SuperCar() {;}
	
//	초기화
//	비밀번호 설정 안 한 경우(초기 비밀번호)
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	비밀번호 설정한 경우
	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
// 메서드는 하나의 기능만 수행 => 기능 분리 (재사용성 높아짐)
//	시동을 켜기
	void engineStart() {
		this.engine = true;
	}
//	차에 탄다
//	비밀번호 확인
//	시동을 켠다
//	"시동을 켜기"라는 로직에 위와 같은 알고리즘이 존재하지만, 해당 기능 하나만 생각해서 로직 짜기!!!
	
//	시동을 끄기
	void engineStop() {
		engine = false; // this 생략 (같은 필드의 변수 사용중)
	}
	
//	비밀번호 검사
	public boolean checkPassword(String password) {
//		문자열 .equals()
		return this.password.equals(password); // 문자열끼리 비교할 때 : equals
	}
	
//	프로그램은 항상 메인에서 실행 !
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "7777"); // 클래스 호출
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String password = null;
		
//		시동 키고끄는건 횟수 알 수 없음
		while(true) {
			System.out.println("1.시동 켜기\n2.시동 끄기");
			choice = sc.nextInt();
			
			if(choice == 1) { // 시동켜기
				if(!ferrari.engine) {
					System.out.println("비밀번호 : ");
					password = sc.next();
					if(ferrari.checkPassword(password)) {
						ferrari.errorCount = 0;
						ferrari.engineStart();
						System.out.println(ferrari.brand + " 시동 켜짐");
					} else {
						ferrari.errorCount++;
						if(ferrari.errorCount > 2) {
							System.out.println("경찰 출동");
							break;
						}
					}
				} else {
					System.out.println("이미 시동이 켜져있습니다.");
				}
			} else if(choice == 2){ // 시동 끄기
				if(ferrari.engine) {
					ferrari.engineStop();
					System.out.println(ferrari.brand + " 시동 꺼짐");
				} else {
					System.out.println("이미 시동이 꺼져 있습니다.");
				}
			} else {
				System.out.println("다시 눌러!!");
			}
		}
	}
}
