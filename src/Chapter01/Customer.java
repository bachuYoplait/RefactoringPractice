package Chapter01;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {

        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();

        String result = getName() + "고객님의 대여 기록 \n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            switch (each.getMovie().get_priceCode()) {
                case Movie.REGULAR:
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;

                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            frequentRenterPoints++;

            if ((each.getMovie().get_priceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1)
                frequentRenterPoints++;

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }

        result += "누적 대여료: " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트: " + String.valueOf(frequentRenterPoints);
        return result;


    }


}
