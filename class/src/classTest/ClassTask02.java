package classTest;

class Cinema {
    String movieTitle;
    int ticketPrice;
    int seats;

    public Cinema() {;}

    public Cinema(String movieTitle, int ticketPrice, int seats) {
        this.movieTitle = movieTitle;
        this.ticketPrice = ticketPrice;
        this.seats = seats;
    }

    void book(Audience audience) {
        if (seats <= 0) {
            System.out.println("잔여 좌석이 없습니다.");
            return;
        }

        double discountedPrice = ticketPrice - (ticketPrice * (audience.discount / 100.0));
        if (audience.money < discountedPrice) {
            System.out.println(audience.name + "님의 잔액이 부족합니다😢");
            return;
        }

        seats--;
        audience.money -= discountedPrice;
        System.out.println(audience.name + "님 예매 완료!");
        System.out.println("할인 : " + discountedPrice + "원");
    }
}

class Audience {
    String name;
    int money;
    int discount;

    public Audience() {;}

    public Audience(String name, int money, int discount) {
        this.name = name;
        this.money = money;
        this.discount = discount;
    }
}

public class ClassTask02 {
	
    public static void main(String[] args) {
        Cinema cinema = new Cinema("영화", 12000, 3);
        Audience audience1 = new Audience("서민아", 10000, 20);
        Audience audience2 = new Audience("홍길동", 15000, 30);

        System.out.println("예매 전 좌석 수 : " + cinema.seats);
        System.out.println("예매 전 잔액 : " + audience1.money);
        cinema.book(audience1);
        
        System.out.println("예매 후 좌석 수 : " + cinema.seats);
        System.out.println("예매 후 잔액 : " + audience1.money);
        System.out.println();

        System.out.println("예매 전 좌석 수 : " + cinema.seats);
        System.out.println("예매 전 잔액 : " + audience2.money);
        cinema.book(audience2);
        
        System.out.println("예매 후 좌석 수 : " + cinema.seats);
        System.out.println("예매 후 잔액 : " + audience2.money);
    }
}
