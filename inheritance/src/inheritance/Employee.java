package inheritance;

class Employee extends Person{

	int nestEgg;
	
	public Employee() {;}
	public Employee(String name, int age, String address, String phone,int nestEgg) {
		super(name, age, address, phone);
		this.nestEgg = nestEgg;
	}
	
	void emergency() {
		System.out.println("비상금을 가지고 있다.");
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
	

}
