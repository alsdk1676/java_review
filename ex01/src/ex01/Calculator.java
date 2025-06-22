package ex01;


//메서드(calcNum)
//정수형 2개의 ‘매개변수’를 넘겨 받아, 더한 값을 출력해주는 기능을 가진 메소드 구현
//
//메서드(calcNum)
//정수형 1개, 실수형 1개의 ‘매개변수’를 넘겨 받아 더한 결과값을 반환(return)해 주는 기능을 가진 메소드 구현
//
//메서드(calcNum)
//실수형 1개를 ‘매개변수’로 넘겨 받아 정수형으로 바꿔주고 결과값을 반환(return)해 주는 기능을 가진 메소드 메소드 구현
//
//메서드(calcNum)
//문자열 매개변수 2개를 넘겨받아 연결해서 출력하는 기능을 가진 메소드
//
// 
//메인 메소드   
//
//클래스의 객체를 메모리에 할당하여, 클래스 객체가 가진 모든 메소드 호출하여
//오류를 검증하고 결과 확인한다.

public class Calculator {
	
	void calcNum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	
	double calcNum(int num1, double num2) {
		return num1 + num2;
	}
	
	int calcNum(double num) {
		return (int)num;
	}
	
	void calcNum(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
//		calcNum1
		calc.calcNum(10, 20);
		
//		calcNum2
		double result1 = 0;
		result1 = calc.calcNum(10, 30.5);
		System.out.println(result1);
		
//		calcNum3
		int result2 = 0;
		result2 = calc.calcNum(11.5);
		System.out.println(result2);
		
//		calcNum3
		calc.calcNum("자바 ", "복습 중,,,");
		
	}

}
