package castingTest;

class Phone {
	
	public Phone() {;}
	
	void makeCall() {
		System.out.println("버튼 눌러 전화 걸기");
	}
	
}

class SmartPhone extends Phone {
	
	public SmartPhone() {;}
	
	@Override
	void makeCall() {
		System.out.println("터치로 전화 걸기");
	}
	
	void useApp() {
		System.out.println("앱 실행");
	}
	
	
}

public class CastingTest {
	public static void main(String[] args) {
		
		 Phone oldPhone = new Phone();
		 SmartPhone galaxy = new SmartPhone();

//		 업캐스팅
        Phone noAppPhone = new SmartPhone();
        noAppPhone.makeCall(); // 터치로 전화 걸기

//        다운캐스팅
        SmartPhone fullPhone = (SmartPhone) noAppPhone;
        fullPhone.useApp(); // 앱 실행

        System.out.println(oldPhone instanceof Phone);	// true
        System.out.println(oldPhone instanceof SmartPhone);  // false
        System.out.println(galaxy instanceof Phone); // true
        System.out.println(noAppPhone instanceof SmartPhone); // true 
        System.out.println(fullPhone instanceof SmartPhone); // true
		
	}
}

