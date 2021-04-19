package Chapter07;

public class Account {

    private AccountType _type;
    public double _daysOverdrawn;

    public double _interestRate;

    public double overdraftCharge() {

        return _type.overdraftCharge(_daysOverdrawn);
    }

    public double getDaysOverdrawn() {
        return _daysOverdrawn;
    }

    public double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

    //필드 캡슐화 interestRate->AccountType으로 이동 시 사용
    double interestForAmount_days(double amount, int days) {
        return _type.getInterestRate() * amount * days / 365;
    }

    /*
    //필드 자체 캡슐화. 많은 메서드가 interestRate필드를 사용할 경우
    double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }
*/

    private void setInterestRate(double arg) {
        //this._interestRate = arg; ->
        _type.setInterestRate(arg);
    }

    private double getInterestRate() {

        //return this._interestRate;->
        return _type.getInterestRate();
    }
    /*
    public double bankCharge(){// overdraftCharge를 AccountType으로 옮기고 해당 메소드를 삭제할 경우
        double result = 4.5;
        if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
        return result;
    }*/
}
