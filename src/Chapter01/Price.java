package Chapter01;

public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    public int getFrequentRenterPonts(int daysRented) {
        return 1;
    }
}

