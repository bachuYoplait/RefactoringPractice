package Chapter07;

public class AccountType {

    public boolean isPremium(){
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
