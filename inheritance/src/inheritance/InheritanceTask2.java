package inheritance;

class Phone {
	String brand;
	long price;
	
	public Phone() {;}

	public Phone(String brand, long price) {
		this.brand = brand;
		this.price = price;
	}
	
	void turnOn() {
		System.out.println("전원 버튼을 눌러 킴");
	}
	
	void turnOff() {
		System.out.println("전원 버튼을 눌러 끔");
	}
	
}

class SmartPhone extends Phone {
	
	public SmartPhone() {;}

	public SmartPhone(String brand, long price) {
		super(brand, price);
	}
	
	@Override
	void turnOn() {
		System.out.println("음성 인식으로 전원 킴");
	}
	
	@Override
	void turnOff() {
		System.out.println("화면 터치로 전원 끔");
	}
	
}

public class InheritanceTask2 {
	public static void main(String[] args) {
		Phone iphone = new Phone("애플", 2000000);
		SmartPhone galaxy = new SmartPhone("삼성", 1000000);
		iphone.turnOn();
		iphone.turnOff();
		galaxy.turnOn();
		galaxy.turnOff();
	}

}
