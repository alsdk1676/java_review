package exception;

import java.util.Scanner;

//  5개의 정수를 입력 받기
//  무한 입력 상태로 구현
//  q를 입력시 나간다
//  입력한 각 정수는 배열에 담기
//  if문은 딱 한 번만 사용!
public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		String expression = null, message = "정수 5개를 순서대로 입력하세요.\nq를 누르면 종료됩니다.", exampleMesaage = "번 째 정수";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		while(true) {
			
			count++;
			System.out.println(count + exampleMesaage);
			expression = sc.next();
			
			if(expression.equals("q")) {
				System.out.println("종료");
				break;
			} else if(count < 5) {
				break;
			} 
			
			try {
				arData[count - 1] = Integer.parseInt(expression); // expression의 String이기 때문에 형변환 필요!

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개 정수를 모두 입력했습니다!");
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				count--;
				
			} catch (Exception e) {
				System.out.println("알 수 없는 오류 발생!");
				e.printStackTrace();
			} 
		}
		
		for(int num : arData) {
			System.out.println(num);
		}
			

		
	}
	

}
