package inheritance;

// Person 
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다.

// Student 
// 인스타아이디
// work 아르바이트를 한다.
// sleep 수업 시간에 잠을 잔다.
// eat 아침을 거른다.

// Employee
// 비상금
// work 하루 종일 일을 한다.
// sleep 잠을 설친다.
// eat 야식을 먹는다.


public class InheritanceTask1 {
	public static void main(String[] args) {
		Person person = new Person("홍길동", 20, "서울시 강남", "01000000000");
		person.work();
		person.eat();
		person.sleep();
		
		Student student = new Student("서민아", 15, "서울시 역삼동", "01000000000", "mina0000");
		student.work();
		student.eat();
		student.sleep();
		
		Employee employee = new Employee();
		employee.work();
		employee.sleep();
		employee.eat();
		
	}
	

}
