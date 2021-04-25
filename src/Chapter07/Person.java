package Chapter07;

public class Person {

    private String _name;
    // private String _officeAreaCode;
   // private String _officeNumber;

    private TelephoneNumber _officeTelephone = new TelephoneNumber();//TelephoneNumber와의 링크

    private String getName() {
        return _name;
    }

    /*
    //클래스 추출 가능
    private String getTelephoneNumer() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }
     */

    private String getTelephoneNumer() {
        return _officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }

    private String getOfficeAreaCore() {
        return _officeTelephone.getAreaCore();
    }

    public void setOfficeAreaCode(String arg) {
        _officeTelephone.setAreaCode(arg);
    }

    /*
    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }*/
}
