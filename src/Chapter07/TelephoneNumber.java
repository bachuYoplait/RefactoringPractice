package Chapter07;

public class TelephoneNumber {

    private String _areaCode;
    private String _number;

   public String getAreaCore() {
        return _areaCode;
    }

    public void setAreaCode(String arg) {
        _areaCode = arg;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String arg) {
        _number = arg;
    }

    public String getTelephoneNumber(){
        return ("(" + _areaCode + ")" + _number);

    }
}
