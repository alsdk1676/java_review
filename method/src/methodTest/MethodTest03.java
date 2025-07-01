package methodTest;

import java.util.Scanner;

public class MethodTest03 {
//	세 정수를 뺄셈해서 결과값을 알려주는 메서드 
	int subtractNum(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드(배열)
	int[] divisionNum(int num4, int num5) {
		int[] newArr = new int[2];
		newArr[0] = num4 / num5;
		newArr[1] = num4 % num5;
		return newArr;
	}
	
//	1~n 까지의 합을 구해주는 메소드
	int printSumToN(int count) {
		int sum = 0;
		for(int i = 0; i <= count; i++) {
			sum += i;
		}
		return sum;
	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드(2 -> 3, 5 -> 6)
//	어떤 값이 홀수인지 짝수인지 알려주는 메소드
	void IsOddOrEven(int num) {
	    if (num % 2 == 0) {
	        System.out.println(num + "는 짝수입니다.");
	    } else {
	        System.out.println(num + "는 홀수입니다.");
	    }
	}

	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeToChar(String content) {
		String result = "";
		for(int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			if(c > 65 && c <= 90) {
				result += (char)(c + 32);
			} else if (c >= 97 && c <= 125) {
				result += (char)(c - 32);
			} else {
				result += c;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		MethodTest03 mt3 = new MethodTest03();
		Scanner sc = new Scanner(System.in);
		
		String message2 = "두 정수를 입력하세요.\nex) 10 \n3";
		int num4 = 0, num5 = 0;
		System.out.println(message2);
		
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		int[] newArray = mt3.divisionNum(num4, num5);
		
		 System.out.print("결과 : ");
	        for (int i = 0; i < newArray.length; i++) {
	            System.out.print(newArray[i] + " ");
	        }
		
		
	}
	

}
