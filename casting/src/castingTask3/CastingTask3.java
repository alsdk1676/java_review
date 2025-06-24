package castingTask3;

class Machine {
	
	public Machine() {;}
	
	public void start() {
		System.out.println("버튼으로 작동시킴");
	}
	
}

class WashingMachine extends Machine {

	public WashingMachine() {;}
	
	@Override
	public void start() {
		System.out.println("세탁 시작");
	}
	
	public void addDetergent() {
		System.out.println("세제를 넣음");
	}
	
}

class Microwave extends Machine {
	
	public Microwave() {;}
	
	@Override
	public void start() {
		System.out.println("전자레인지 작동");
	}
	
	public void setTimer() {
		System.out.println("타이머 설정 완료");
	}
	
}

public class CastingTask3 {
	public static void main(String[] args) {
		Machine basic = new Machine();
		Machine wash = new WashingMachine(); // 업캐스팅
		Machine micro = new Microwave(); // 업캐스팅
		
		basic.start();
		wash.start();
		micro.start();
		
        System.out.println(wash instanceof Machine);         // true
        System.out.println(wash instanceof WashingMachine);  // true
        System.out.println(wash instanceof Microwave);       // false

        System.out.println(micro instanceof Machine);        // true
        System.out.println(micro instanceof Microwave);      // true
        System.out.println(micro instanceof WashingMachine); // false
			

		
		
		
		
	}

}
