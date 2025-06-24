package castingTask2;

public class MagicItem {
//	공통 속성: name, grade, mana
//	메서드: apply() → 기본 출력: "아이템을 사용했습니다"
	String name;
	int grade;
	int mana;

	public MagicItem() {;}
	
	public MagicItem(String name, int grade, int mana) {
		this.name = name;
		this.grade = grade;
		this.mana = mana;
	}
	
	public void apply() {
		System.out.println("아이템을 사용했습니다.");
	}
	
	
	

}
