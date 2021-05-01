package Chapter07.HideDelegate;

public class Person {

    Department _department;

    /* getManager라는 위임 메소트가 생겼으므로 Department를 반환해주는 get 함수는 삭제한다.
    public Department getDepartment() {
        return _department;
    }
*
/
     */
    public void setDepartment(Department arg) {
        _department = arg;
    }

    public Person getMantager() {
        return _department.getManager();
    }

//과잉 중개 제거를 위해 대리 객체(Department)에서 메소드를 호출할 수있도록 Person에서 Department를 반환해주는 함수를 생성
    public Department getDepartment() {
        return _department;
    }
}
