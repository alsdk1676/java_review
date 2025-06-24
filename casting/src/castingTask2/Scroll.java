package castingTask2;

public class Scroll extends MagicItem {
	
	public Scroll() {;}

	public Scroll(String name, int grade, int mana) {
		super(name, grade, mana);
	}
	
	@Override
	public void apply() {
		System.out.println("마법 스킬이 강화되었습니다.");
	}
	
}
