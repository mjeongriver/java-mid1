package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        //Integer newInteger = new Integer(10);
        Integer newInteger = Integer.valueOf(10);
        Integer intergerObj = Integer.valueOf(10); //valueOf() 메서드는 내부적으로 정수 값을 캐싱 -> 항상 같은 객체 인스턴스 반환
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("intergerObj = " + intergerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = intergerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == intergerObj));
        System.out.println("equals: " + newInteger.equals(intergerObj));
    }
}
