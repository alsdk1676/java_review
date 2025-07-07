package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask03 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		numbers.forEach(System.out::println);
//		int result = 0;
//		numbers.stream().map(n -> result += n);
		
//      1) 1~50까지 ArrayList에 담고 출력하기
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		
//		값을 넣는 로직
//		for(int i = 0; i < 10; i++) {
//			numbers1.add(i + 1);
//		}
		
//		값을 출력하는 로직
//		for(int i = 0; i < numbers1.size(); i++) {
//			System.out.println(numbers1.get(i));
//		}
		
//		값을 넣음
//		numbers1.forEach(null);
		IntStream.rangeClosed(1, 50).forEach(n -> { numbers1.add(n); });
//		값을 출력
		numbers1.forEach(num -> { System.out.println(num); });
		
		
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 != 0).forEach(n -> { numbers2.add(n); });
		numbers2.forEach(num -> { System.out.println(num); });

		
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		IntStream.range(1, 51).filter(n -> n % 2 == 0).forEach(n -> { numbers3.add(n); });
		numbers3.forEach(num -> { System.out.println(num); });
		
		
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Character> chars1 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(c -> chars1.add((char)c));
		chars1.forEach(System.out::println);
		
//		4-1) a~z까지 A~Z로 변경해서 출력하기
		ArrayList<Character> chars2 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').map(i -> (char)i).map(Character::toUpperCase).forEach(c -> chars2.add((char)c));
		chars2.forEach(System.out::println);
		
//		풀이 2
//		ArrayList<Integer> data = new ArrayList<Integer>();
//		IntStream.rangeClosed('a', 'z').forEach(data::add);
		
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
		ArrayList<Character> chars3 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').filter(i -> i % 2 == 1).map(i -> (char)i).forEach(c -> chars3.add((char)c));
		chars3.forEach(System.out::println);
		
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 30).filter(num -> num >= 10 && num <= 20).forEach(num -> numbers4.add(num));
		numbers4.forEach(System.out::println);
		
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기 (담으면 forEach)
		ArrayList<Integer> numbers5 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).forEach(num -> numbers5.add(num));
		
		int sum = 0;
		for (int num : numbers5) {
		    sum += num; 
		}

		System.out.println(sum);
		
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
		ArrayList<String> strs1 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
		strs1.stream().filter(str -> str.contains("a")).forEach(System.out::println);
		
		
	}
	

}
