package Chapter07.HideDelegate;

public class Department {

    private String _chargeCode;
    private Person _manager;

    public Department(Person manager) {
        _manager = manager;

    }

    public Person getManager() {
        return _manager;
    }
}
