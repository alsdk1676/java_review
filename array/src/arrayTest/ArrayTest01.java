package arrayTest;

public class ArrayTest01 {
	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30};
		System.out.println(arr1); 
		System.out.println(arr1[1]); 
		
//		arr2에 5, 4, 3, 2, 1 순서대로 담고 출력하기
		int[] arr2 = {1, 32, 10, 11, 15};
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 5 - i;
			System.out.println(arr2[i]);
		}
		
		int[] newArr = {5, 4, 3, 2, 1};
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = newArr[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
		}
	}
}
