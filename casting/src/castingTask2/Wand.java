package castingTask2;

public class Wand extends MagicItem {
	
	public Wand() {;}

	public Wand(String name, int grade, int mana) {
		super(name, grade, mana);
	}
	
	@Override
	public void apply() {
		System.out.println("마력을 얻었습니다.");
	}

}
