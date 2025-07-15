package exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
			try {
				
				arData[0] = 20;
				System.out.println(arData[0] / num); 
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 확인!");
			} catch (ArithmeticException e) { 
				System.out.println("0으로 나눌 수 없음");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
				e.printStackTrace(); 
			} catch (Exception e) { 
				e.printStackTrace();
			} 

	}
}
