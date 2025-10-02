package refactoringBook.ex1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = amountFor(each, thisAmount);

            frequentRenterPoints++;

            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && (each.getDaysRented() > 1)) {
                frequentRenterPoints++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;

            result += "누적 대여료 " + String.valueOf(totalAmount) + "\n";
            result += "적립 포인트" + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        }
        return result;
    }

    // xxx, 25-10-03 : aRetnal이 직관적인 변수명인가 ?
    private static double amountFor(Rental each, double aRental) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                aRental += 2;
                if (each.getDaysRented() > 2) {
                    aRental += (each.getDaysRented() - 2) * 1.5;
                }
            case Movie.NEW_RELEASE:
                aRental += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                aRental += 1.5;
                if (each.getDaysRented() > 3) {
                    aRental += (each.getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return aRental;
    }
}
