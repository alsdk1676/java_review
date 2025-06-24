package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
		Magician magician = new Magician("루미", 1);
		
		MagicItem[] magicItems = {
			new Wand("에너지 완드", 10, 100),
			new Potion("회복 포션", 30, 250),
			new Scroll("파이어볼 스크롤", 1, 1000)
		};
		
		
		for(int i = 0; i < magicItems.length; i++) {
			magician.useItem(magicItems[i]);
		}
		
	}
}
