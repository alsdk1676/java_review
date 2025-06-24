package castingTask2;

public class Potion extends MagicItem {
	
	public Potion() {;}
	

	public Potion(String name, int grade, int mana) {
		super(name, grade, mana);
	}


	@Override
	public void apply() {
		System.out.println("HP가 회복되었습니다.");
	}

}
