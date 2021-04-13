package Chapter01;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {

        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPonts(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
