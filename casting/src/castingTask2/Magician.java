package castingTask2;

public class Magician {
	String name;
	int level;
	
	{
		this.level = 1;
	}
	
	public Magician() {;}

	public Magician(String name, int level) {
		this.name = name;
	}
	
	public void useItem(MagicItem magicItem) {
		if(magicItem instanceof Wand) {
			Wand wand = (Wand)magicItem;
			wand.apply();
		} else if (magicItem instanceof Potion) {
			Potion potion = (Potion)magicItem;
			potion.apply();
		} else if (magicItem instanceof Scroll) {
			Scroll scroll = (Scroll)magicItem;
			scroll.apply();
		}
	}

	

}
