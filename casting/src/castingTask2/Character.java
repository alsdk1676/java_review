package castingTask2;
// 사냥을 담당하는 클래스
// 몬스터의 타입에 따라 다른 행동을 취하도록 하고, 여러 몬스터를 동일한 방식으로 처리할 수 있게 도와줌

public class Character {
//	이름, 직업, 레벨
	String name;
	String job;
	int level;

//	static 블록
	static {
		System.out.println("여행을 환영합니다");
	}
	
//	초기화 블록
	{
		this.level = 1;
	}
	
	public Character() {;}

	public Character(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
//	사냥하는 메서드
//	요정, 오크, 사람
	public void hunt(Monster monster) { // 업캐스팅 : 부모의 그릇에 자식이 들어갔기 때문
		if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			// 다운캐스팅: Fairy 객체일 경우, 이를 Fairy(자식) 타입으로 변환
			fairy.get();
			// Fairy 객체의 get 메서드 호출
			
		}else if(monster instanceof Orc) {
			Orc orc = (Orc)monster;
			orc.get();
			
		}else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.get();
		}
	}
	
}


