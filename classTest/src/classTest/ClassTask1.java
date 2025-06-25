package classTest;

class Market {
//	상품, 가격, 재고
//	sell() 메서드
	String productName;
	int productPrice;
	int productStock;
	
//	기본 생성자
	public Market() {;}
	
//	초기화 생성자 // 값을 알고있을때 초기화 하는 용도
//	Alt + Shift + S -> O -> Enter
	public Market(String productName, int productPrice, int productStock){
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	sell() 메서드
//	돈과 할인율 등 고객의 정보를 받아야되는데 해당 정보를 Customer 클래스가 다 담고 있기 때문에 매개 변수로 Customer를 받기 !!
	void sell(Customer customer) {
		productStock--; // this는 생략 (productStock은 내가 가지고 있음)
		System.out.println("할인된 가격 : " + productPrice * ( customer.discount / 100.0));
		customer.money -= productPrice - productPrice * ( customer.discount / 100.0); // 할인율 계산식
	}
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	String name;
	String phoneNum;
	int money;
	int discount;
	
//	기본 생성자
	public Customer() {;}
	
//	생성자(초기화)
	public Customer(String name, String phoneNum, int money, int discount) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask1 {
	
//	기본 생성자
	public ClassTask1() {;}
	
	
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market emart = new Market("감자", 7000, 100);
		Customer sma = new Customer("서민아", "01012345678", 10000, 30);
		Customer hgd = new Customer("홍길동", "01000000000", 100000, 50);
		
		System.out.println("판매 전 재고 : " + emart.productStock);
		System.out.println("판매 전 돈 : " + sma.money);
		emart.sell(sma); // 구매자를 받으면 됨
		System.out.println("판매 후 재고 : " + emart.productStock);
		System.out.println("판매 후 돈 : " + sma.money);
		
		System.out.println("판매 전 재고 : " + emart.productStock);
		System.out.println("판매 전 돈 : " + sma.money);
		emart.sell(hgd);
		System.out.println("판매 후 재고 : " + emart.productStock);
		System.out.println("판매 후 돈 : " + sma.money);
		
	}
}


