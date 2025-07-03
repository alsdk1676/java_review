package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest<T extends Number> {
	
	T data;

	public static void main(String[] args) {
		
		ArrayList<Integer> datas = new ArrayList<Integer>(); // Integer 배열
		System.out.println(datas.size()); 
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(70);
		System.out.println(datas.size());
		
		try {
			
			datas.get(0); 
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력!");
			e.printStackTrace();
		} catch (Exception e) {
		}
		
		System.out.println(datas); 
		
		Collections.shuffle(datas); 
		System.out.println(datas);
		
		if(datas.contains(50)) {
			try {
				datas.add(datas.indexOf(50) + 1, 500); 
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
			}
		};
		
		
		System.out.println(datas);

//		1) 80을 인덱스로 삭제
		if(datas.contains(80)) {	
			int prev = 0;
			try {
				datas.remove(datas.indexOf(80));
				System.out.println("삭제된 값 : " + prev);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
			}
		};
		
		System.out.println(datas);
		
		
//		2) 80을 값으로 삭제 
		if(datas.contains(80)) {
			boolean isRemove = false; 
			try {
				isRemove = datas.remove(Integer.valueOf(80)); // object로 인식함 => object는 int보다 Integer랑 가까움
				System.out.println("삭제 여부 : " + isRemove);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 다시 입력!");
				e.printStackTrace();
			} catch (Exception e) {
			}
		};
		
		System.out.println(datas);
	} 

}
