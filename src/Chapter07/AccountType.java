package Chapter07;

public class AccountType {

    private double _interestRate;

    public void setInterestRate(double arg) {
        this._interestRate = arg;

    }

    public double getInterestRate() {
        return this._interestRate;
    }

    public boolean isPremium() {
        return true;
    }


    public double overdraftCharge(double daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        } else
            return daysOverdrawn * 1.75;
    }

    public double overdraftCharge(Chapter07.Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.getDaysOverdrawn() > 7) result += (account.getDaysOverdrawn() - 7) * 0.85;
            return result;
        } else
            return account.getDaysOverdrawn() * 1.75;
    }
}
