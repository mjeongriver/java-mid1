package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        //String은 불변으로 설계 되어서 사이드 이펙트 문제가 발생하지 않는다.
        String str1 = "hello";
        String str2 = str1.concat(" java!"); //String은 불변 객체이기 때문에 새로운 결과를 만들어서 반환한다
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
