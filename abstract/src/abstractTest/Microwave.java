package abstractTest;

public class Microwave extends MachineAdapter {
	
    @Override
    public void start() {
        System.out.println("전자레인지 시작");
    }

    @Override
    public void stop() {
        System.out.println("전자레인지 멈춤");
    }

}
