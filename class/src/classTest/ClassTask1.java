package classTest;

class Market {
//	상품, 가격, 재고
//	sell() 메서드
	String productName;
	int productPrice;
	int productStock;
	
	public Market() {;}
	
	public Market(String productName, int productPrice, int productStock){
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
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
	
	public Customer() {;}
	
	public Customer(String name, String phoneNum, int money, int discount) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask1 {
	
	public ClassTask1() {;}
	
	
	public static void main(String[] args) {
		Market emart = new Market("감자", 7000, 100);
		Customer sma = new Customer("서민아", "01012345678", 10000, 30);
		Customer hgd = new Customer("홍길동", "01000000000", 100000, 50);
		
		System.out.println("판매 전 재고 : " + emart.productStock);
		System.out.println("판매 전 돈 : " + sma.money);
		emart.sell(sma);
		System.out.println("판매 후 재고 : " + emart.productStock);
		System.out.println("판매 후 돈 : " + sma.money);
		
		System.out.println("판매 전 재고 : " + emart.productStock);
		System.out.println("판매 전 돈 : " + sma.money);
		emart.sell(hgd);
		System.out.println("판매 후 재고 : " + emart.productStock);
		System.out.println("판매 후 돈 : " + sma.money);
		
	}
}


