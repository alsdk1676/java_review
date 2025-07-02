package arrayTest;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {

//		실습 복습
		
//		10~1까지 중 짝수만 배열에 담고 출력
		int[] arData1 = new int[10];
		for(int i = 0; i < 10; i ++) {
			arData1[i] = i + 1;
//			System.out.println(arData1[i]);
			if (i % 2 == 1) {
				System.out.println(arData1[i]);
			}
		}
		
//		1~10까지 배열에 담고 출력
		int[] arData2 = new int[10];
		for(int i = 0; i < arData2.length; i++) {
			arData2[i] = i + 1;
			System.out.println(arData2[i]);
		}


//		1~100까지 배열에 담은 후 홀수만 출력
		int[] arData3 = new int[100];
		for(int i = 0; i < arData3.length; i++) {
			arData3[i] = i + 1;
			if (arData3[i] % 2 != 0) {
				System.out.println(arData3[i]);
			}
		}

		
//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력
		int[] arData4 = new int[10];
		int result = 0;
		for(int i = 0; i < 10; i++) {
			arData4[i] = i + 1;
			
			if (arData4[i] % 2 == 0) {
				result += arData4[i];
			}
		}
		System.out.println(result);

		
//		A~F까지 배열에 담고 출력
		char[] arData5 = new char[6];
		for(int i = 0; i < arData5.length; i++) {
			arData5[i] = (char)(65 + i);
			System.out.println(arData5[i]);
		}

		
//		A~F까지 중 C를 제외하고 배열에 담은 후 출력
		char[] arData6 = new char[6];
		for(int i = 0; i < arData6.length; i++) {
			arData6[i] = (char)(65 + i);
			if(arData6[i] == 'C') { continue; }
			System.out.println(arData6[i]);
		}

//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
//		5개의 정수를 입력받는다. => Scanner로
//		입력받은 5개의 정수를 배열에 담는다
//		배열에 담긴 5개의 정수 중 최댓값과 최솟값을 찾는다
//		구한 최댓값과 최솟값을 출력한다.
		Scanner sc = new Scanner(System.in);
		
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
		String message6 = "정수의 개수를 입력하세요.";
		int length = 0, inputNum = 0, total = 0;
		double avg = 0.0;
		
		// 개수 입력받기
		System.out.println(message6);
		length = sc.nextInt();
		int[] userArray = new int[length];
		
//		개수만큼 정수 출력하기
		for(int i = 0; i < length; i++) {
//			userArray[i] = sc.nextInt();
			System.out.println(i + 1 + "번 째 정수 : " );
			userArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i < length; i++) {
			total += userArray[i];
		}
		System.out.println("총합 : " + total);
		
		avg = (double)total / length;
		System.out.println("평균 : " + avg);

		
	}

}

