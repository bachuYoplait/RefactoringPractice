package Chapter06;

public class ReplaceTempWithQuery {

    private double _quantitiy=5.0;
    private double itemPrice=1000;

    public double getBasePrice() {
        if (calBasePrice() > 1000)
            return calBasePrice() * 0.95;

        else
            return calBasePrice() * 0.98;
    }

    double calBasePrice() {
        System.out.println("dd")  ;
        return _quantitiy * itemPrice;
    }

    public static void main(String[] args){
        ReplaceTempWithQuery tmp=new ReplaceTempWithQuery() ;

        tmp.getBasePrice();
    }

}
