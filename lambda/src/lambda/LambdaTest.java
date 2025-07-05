package lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
		//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		 PrintNumInter printNumInter = () -> {
			 for (int i = 1; i <= 10; i++) {
				 System.out.println(i);
				 }
			 };
			 printNumInter.printUpTo10();
			 
		
		//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
		PrintStringInter printString = (content, c) -> {
			int count = 0;
			for (int i = 0; i < content.length(); i++) {
				if(content.charAt(i) == c) {
					count++;
				}
			}
			return count;
		};
		int result2 = printString.strCount("apple", 'a');
		System.out.println("해당 문자 개수 : " + result2);
			 
		
		//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
		ReverseInter reverseInter = (content) -> {
			String result = "";
			for(int i = 0; i < content.length(); i++) {
				result += content.charAt(content.length() - i - 1);
			}
			return result;
		};
		System.out.println(reverseInter.reverseString("apple"));
		
			
		
		
	}

}
