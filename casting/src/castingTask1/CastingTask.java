package castingTask1;

public class CastingTask {

	public void checkVehicle(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			Car car = (Car)vehicle;
			car.airConditionOn();
		} else if(vehicle instanceof Motorcycle) {
			Motorcycle motorcycle = (Motorcycle)vehicle;
			motorcycle.helmetSupport();
		} else if(vehicle instanceof Truck) {
			Truck truck = (Truck)vehicle;
			truck.loadGoods();
		}
		

	}
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.checkVehicle(new Car());
		ct.checkVehicle(new Motorcycle());
		ct.checkVehicle(new Truck());
	}
	
}
