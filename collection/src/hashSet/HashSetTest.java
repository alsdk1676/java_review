package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ENFP");
		mbtiType.add("INFJ");
		mbtiType.add("ISFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("INFP");
		System.out.println(mbtiType);
		
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {  
			System.out.println(iter.next()); 
		}
		
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 9, 9 , 9)); // asList : 초기값 넣어줌
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas)); // 생성자한테 datas(=ArrayList)넘김
		System.out.println(datas); 
	
	}

}



















