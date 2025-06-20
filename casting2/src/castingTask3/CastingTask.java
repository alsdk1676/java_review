package castingTask3;

public class CastingTask {
	public void orderFood(Food food) {
		if(food instanceof Burger) {
//			다운 캐스팅 (부모 -> 자식)
			Burger burger = (Burger)food;
			burger.addKetchup();
		}else if(food instanceof Pizza) {
			Pizza pizza = (Pizza)food;
			pizza.addCheese();
		}else if(food instanceof Sushi) {
			Sushi sushi = (Sushi)food;
			sushi.addWasabi();
		}
	}
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		// Food food = new Burger();
		// 업캐스팅 : 자식 -> 부모 (명시 안해줘도 자동으로)
		ct.orderFood(new Burger());
		ct.orderFood(new Pizza());
		ct.orderFood(new Sushi());
	}

}
