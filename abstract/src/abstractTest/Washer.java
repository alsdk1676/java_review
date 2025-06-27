package abstractTest;

public class Washer extends MachineAdapter {
	
    @Override
    public void start() {
        System.out.println("세탁기 시작");
    }

    @Override
    public void stop() {
        System.out.println("세탁기 멈춤");
    }

}
