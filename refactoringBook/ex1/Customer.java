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

            thisAmount = each.getCharge();

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
}
