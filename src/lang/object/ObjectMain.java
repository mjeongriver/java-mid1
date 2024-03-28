package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        //Object 클래스를 상속 받는 이유: 공통 기능 제공, 다형성의 기본 구현
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string); //객체의 정보를 제공한다.
    }
}
