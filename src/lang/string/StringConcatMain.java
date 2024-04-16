package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {

        String a = "hello"; //x001
        String b = " Java"; //x002

        String result1 = a.concat(b);
        String reuslt2 = a + b; //문자열만 편의상 특별히 + 연산을 제공한다.
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + reuslt2);
    }
}
