package Chapter07;

public class Account {

    private AccountType _type;
    public double _daysOverdrawn;

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
    /*
    public double bankCharge(){// overdraftCharge를 AccountType으로 옮기고 해당 메소드를 삭제할 경우
        double result = 4.5;
        if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
        return result;
    }*/
}
