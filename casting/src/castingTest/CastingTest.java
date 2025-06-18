package castingTest;

class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}
class SuperCar extends Car {
	public SuperCar() {;}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
	
}

public class CastingTest {
	public static void main(String[] args) {
//		객체화
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar(); // 부모 Car 클래스에 자식 superCar 클래스가 들어감
//		noOptionFerrari는 Car 타입의 변수이지만, SuperCar 객체를 참조
		noOptionFerrari.engineStart(); 
		// 기존의 오버라이딩 되어있는 값은 부모가 선언했기 때문에 그대로 쓸 수 있음. 자식이 오버라이딩 했다면 오버라이딩 한 코드가 나옴
		
//		오류
//		SuperCar ferrari2 = new Car(); // 자식의 그릇에 부모가 들어가면 부족해서 오류
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari; // 자식의 그릇으로 형변환!
		fullOptionFerrari.openRoof();
		
//		객체 instanceof 타입 : 참 또는 거짓의 리턴값을 가집
		System.out.println(matiz instanceof Car); // true: 부모는 자식 타입이 아니기 때문에, matiz는 Car 타입이므로
		System.out.println(matiz instanceof SuperCar); // false: matiz는 SuperCar 타입이 아님
		System.out.println(ferrari instanceof Car); // true: ferrari는 SuperCar로 Car를 상속받았기 때문에
		System.out.println(ferrari instanceof SuperCar); // true: ferrari는 실제로 SuperCar 객체
		System.out.println(noOptionFerrari instanceof Car); // true: noOptionFerrari는 Car 타입으로 업캐스팅된 SuperCar 객체
		System.out.println(noOptionFerrari instanceof SuperCar);  // true: noOptionFerrari는 실제 SuperCar 객체
		System.out.println(fullOptionFerrari instanceof Car); // true: fullOptionFerrari는 SuperCar 객체로 Car를 상속받았기 때문
		System.out.println(fullOptionFerrari instanceof SuperCar); // true: fullOptionFerrari는 SuperCar 객체

	
		
	}

}


