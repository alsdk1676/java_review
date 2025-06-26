package inheritance;

class Student extends Person {
	// Student 클래스
	// 인스타아이디
	// work 아르바이트를 한다.
	// sleep 수업 시간에 잠을 잔다.
	// eat 아침을 거른다.
	String instaID;
	
	public Student() {;}
	public Student(String name, int age, String address, String phone, String instaID) {
		super(name, age, address, phone);
		this.instaID = instaID;
	}
	
	void insta() {
		System.out.println("인스타 아이디를 가지고 있다.");
	}
	
	@Override
	void work() {
//		super.work();
		System.out.println("아르바이트를 한다.");
	}
	
	@Override
	void sleep() {
//		super.sleep();
		System.out.println("수업 시간에 잠을 잔다.");
	}
	
	@Override
	void eat() {
//		super.eat();
		System.out.println("아침을 거른다.");
	}

}
