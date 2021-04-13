package Chapter06;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {

    public Vector _orders;
    public String _name;

    public void pintOwings(double previousAmount) {

        printBanner();
        double outstanding = getOutStanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

    public void printBanner() {
        System.out.println("고객외상");
    }

    void printDetails(double outstanding) {

        System.out.println("고객명: " + _name);
        System.out.println("외상액 " + outstanding);
    }

    public double getOutStanding(double inicialValue) {

        Enumeration e = _orders.elements();

        double result = inicialValue;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }

        return result;
    }
}
