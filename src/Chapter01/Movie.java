package Chapter01;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;


    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);

    }

    public Price getPriceCode() {
        return _price;
    }

    public void setPriceCode(int arg) {

        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("가격 코드가 잘못됐습니다");
        }
    }

    public String getTitle() {
        return _title;
    }


    public double getCharge(int daysRented) {

        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPonts(daysRented);

    }

}
