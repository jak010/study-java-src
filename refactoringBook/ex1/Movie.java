package refactoringBook.ex1;


import lombok.Getter;
import lombok.Setter;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 0;

    @Setter
    @Getter
    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPrice(priceCode);
    }

    public Price getPriceCode() {
        return price;
    }

    public void setPrice(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildPriceCode();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("가격 코드가 잘못됐습니다");
        }

    }

    // 최초 Customer.amountFor -> Rental.getCharge() 로 리팩터링됨
    // Rental.getCharge()  -> Movie 로 리팩터링됨
    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {

        // 최신물을 이틀 이상 대여하면 보너스 포인트 지급하고 그 외엔 1 포인트로 지급하는 코드를
        // 뺴내 getFrequentRenterPoints 메서드로 만들고 이 Retnal 클래스로 옮겼다.
        return price.getFrequentRenterPoints(daysRented);
    }
}

