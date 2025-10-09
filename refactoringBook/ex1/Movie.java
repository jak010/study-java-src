package refactoringBook.ex1;


public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 1;
    public static final int NEW_RELEASE = 0;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    // 최초 Customer.amountFor -> Rental.getCharge() 로 리팩터링됨
    // Rental.getCharge()  -> Movie 로 리팩터링됨
    double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {

        // 최신물을 이틀 이상 대여하면 보너스 포인트 지급하고 그 외엔 1 포인트로 지급하는 코드를
        // 뺴내 getFrequentRenterPoints 메서드로 만들고 이 Retnal 클래스로 옮겼다.
        if ((getPriceCode() == NEW_RELEASE) && (daysRented > 1)) {
            return 2;
        }
        return 1;

    }
}
