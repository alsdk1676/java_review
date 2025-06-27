package abstractTest;

public interface Machine {
	
	public void start();
	public void stop();
	public void reset();
	
	public static void main(String[] args) {
        Washer washer = new Washer();
        Microwave microwave = new Microwave();

        washer.start();
        washer.stop();

        microwave.start();
        microwave.stop();
	}

}
