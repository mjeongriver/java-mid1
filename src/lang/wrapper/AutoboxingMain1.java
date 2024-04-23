package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); //컴파일 단계에서 추가

        //Wrapper -> primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
