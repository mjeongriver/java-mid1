package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //a와 b는 서로 다른 Address 인스턴스를 참조한다.
        //따라서 b가 참조하는 인스턴스의 값을 변경해도 a에는 영향을 주지 않는다.
        //참조값을 다른 변수에 대입하는 순간 여러 변수가 하나의 객체를 공유하게 된다. 즉, 객체의 공유를 막을 수 있는 방법이 없다.
        Address a = new Address("서울"); //x001
        Address b = new Address("서울"); //x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
