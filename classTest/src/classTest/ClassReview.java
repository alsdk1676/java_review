package classTest;

public class ClassReview {
   
//   클래스로 리턴할 때
//   각 필드로 직접 접근하여 원하는 위치에 사용할 때
   
//   배열로 리턴할 때
//   모든 데이터를 순서대로 사용할 때
   
   Result getMaxAndMin(int[] arData) { // int[] arData에는 리턴값인 주소값이 들어있음
//	   객체 생성
      Result result = new Result(arData[0], arData[0]); 
//		생성자 => 주소값을 리턴 => 통째로가 리턴값 => 주소값이 들어가있음 => 주소에 접근 중
//      Result(int max, int min)에 접근 => Result라는 클래스의 max와 min의 초기값을 넘겨줌
      
      for(int i = 0; i < arData.length; i++) {
         if(result.min > arData[i]) { result.min = arData[i];};
         if(result.max < arData[i]) { result.max = arData[i];};
      }
//      클래스로 리턴하기
      return result;
   }
   
   
   public static void main(String[] args) {
      ClassReview ct2 = new ClassReview();
      int[] arData = {5, 6, 10, 12, 15};
      
//      getMaxAndMin()의 리턴타입이 Result 이기 때문에
      Result result = ct2.getMaxAndMin(arData);
      System.out.println(result.min);
      System.out.println(result.max);
   }
}
