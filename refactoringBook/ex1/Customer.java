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

        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();

            frequentRenterPoints = each.getFrequentRenterPoints();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";


            result += "누적 대여료 " + String.valueOf(getTotalCharge()) + "\n";
            result += "적립 포인트" + String.valueOf(getTotalFrequentRenterPoints()) + "\n";

        }
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "<H1>" + getName() + " 고객님의 대여 기록</H1>";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // 모든 대여 비디오 정보와 대여료를 출력
            result += "<P>" + each.getMovie().getTitle() + " : " + String.valueOf(each.getCharge()) + "</P>";
        }
        // 푸터 행 추가
        result += "<P>누적 대여료 : " + String.valueOf(getTotalCharge()) + "</P>";
        result += "<P>적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints()) + "</P>";
        return result;

    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
