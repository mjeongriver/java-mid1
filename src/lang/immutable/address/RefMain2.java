package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        //불변 객체는 값을 변경할 수 없다. 따라서 불변 객체의 값을 변경하고 싶다면 변경하고 싶은 값으로 새로운 불변 객체를 생성해야 한다.
        //이렇게 하면 기존 변수들이 참조하는 값에는 영향을 주지 않는다.
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다. x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //b의 값을 부산으로 변경해야함
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
