package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {

        //add 메서드는 자기 자신의 참조값을 반환함
        //따라서 adder1, adder2, adder3는 모두 같은 참조값을 사용함
        ValueAdder adder  = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);

    }
}
