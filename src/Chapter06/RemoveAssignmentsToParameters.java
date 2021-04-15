package Chapter06;

import java.util.Date;

public class RemoveAssignmentsToParameters {
    int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;

        return result;
    }

    public static void main(String[] args) {
        Date d1 = new Date("1 Apr 98");
        nextDateUpdate(d1);
        System.out.println("nextDay 메서드 실해 후 d1 값: " + d1);

        Date d2 = new Date("1 Apr 98");
        nextDateReplace(d2);
        System.out.println("nextDay 메서드 실행 후 d2 값: " + d2);
    }

    private static void nextDateUpdate(Date arg) {
        arg.setDate(arg.getDate() + 1);
        System.out.println("nextDay 메서트 안의 arg 값: " + arg);
    }

    private static void nextDateReplace(Date arg) {
        arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1); // new Date으로 신규 Date을 생성한 것이므로 매개변수 D2(arg)에는 영향이 없다.
        System.out.println("nextDay 메서드 안의 arg 값: " + arg);
    }


    /*
    private static void nextDateReplace(final Date arg) {
        Date arg2 = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        System.out.println("nextDay 메서드 안의 arg 값: " + arg);
    }*/
}
