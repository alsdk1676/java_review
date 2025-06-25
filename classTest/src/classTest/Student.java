package classTest;

import java.util.Scanner;

public class Student {
//	학생 1명
//	학생의 학번, 이름, 국어 점수, 영어 점수, 수학 점수를 입력받고
//	총점과 평균을 출력하기

//	추상화
//	변수 선언!!
	int number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;


//	기본 생성자
	public Student() {;} // 생성자도 메서드
	
//	public Student(int number) {;} // 학번만 주어졌을 때
//	public Student(String name) {;} // 이름만 주어졌을 때
//	public Student(int number, String name) {;}

//	생성자
//	초기화
	public Student(int number, String name, int kor, int eng, int math) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
//		String.format : 형식 지정자
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}

	//총점과 평균을 출력하기
	public static void main(String[] args) {
		
		Student 서민아 = new Student(1, "서민아", 100, 90, 80);
		Student 홍길동 = new Student();
		System.out.println("총 점 : " + 서민아.total);
		System.out.println("평 균 : " + 서민아.average);
	}

}


	
