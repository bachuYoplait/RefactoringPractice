package Chapter07.HideDelegate;

public class Main {

    public static void main(String[] argas){
        Person john=new Person();

        //Person manager=john.getDepartment().getManager(); manager 정보를 얻을 때 Department의 객체 구조(사용법)을 알 필요 없다.<- 캡슐화 필요
        Person manager=john.getMantager();
    }
}
