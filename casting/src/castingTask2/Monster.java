package castingTask2;

//Fairy, Human, Orc 클래스에서 공통된 부분을 부모 클래스인 Monster에서 처리

public class Monster {
	String name;
	int hp;
	int experience;
	
	public Monster() {;}

	public Monster(String name, int hp, int experience) {
		this.name = name;
		this.hp = hp;
		this.experience = experience;
	}
	
	void get() {
		System.out.println("몬스터를 잡았습니다.");
		System.out.println("아이템을 얻었습니다");
		System.out.println(experience + "경험치를 얻었습니다");
	}
	
}
