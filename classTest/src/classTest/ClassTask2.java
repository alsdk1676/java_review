package classTest;

public class ClassTask2 {
   
   
   Result getMaxAndMin(int[] arData) { // int[] arData에는 리턴값인 주소값이 들어있음
      Result result = new Result(arData[0], arData[0]); 
      
      for(int i = 0; i < arData.length; i++) {
         if(result.min > arData[i]) { result.min = arData[i];};
         if(result.max < arData[i]) { result.max = arData[i];};
      }
      return result;
   }
   
   
   public static void main(String[] args) {
      ClassTask2 ct2 = new ClassTask2();
      int[] arData = {5, 6, 10, 12, 15};
      
      Result result = ct2.getMaxAndMin(arData);
      System.out.println(result.min);
      System.out.println(result.max);
   }
}
