package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTest {
	public static void main(String[] args) {

//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로 앞에 "/app"을 붙여준다.
		ArrayList<String> apps = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		apps.stream().map((app) -> "/app" + app).forEach(System.out::println);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		numbers.stream().sorted().forEach(System.out::println);		
		
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		List<Integer> list = numbers2.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(list.toString());
		
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		String str = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(str);
		
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		ArrayList<Integer> even = new ArrayList<Integer>();
		numbers.stream().filter((n) -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
		}	
}
