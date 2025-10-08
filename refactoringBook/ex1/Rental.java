package refactoringBook.ex1;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    // 최초 Customer.amountFor -> Rental.getCharge() 로 리팩터링됨
    double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3) {
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints() {

        // 최신물을 이틀 이상 대여하면 보너스 포인트 지급하고 그 외엔 1 포인트로 지급하는 코드를
        // 뺴내 getFrequentRenterPoints 메서드로 만들고 이 Retnal 클래스로 옮겼다.
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && (getDaysRented() > 1)) {
            return 2;
        }
        return 1;

    }


}
