package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {

        String strWithSpaces = "     Java Programming ";
        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("양쪽 공백 제거(trim): '" + strWithSpaces.trim() + "'");
        //whitespace와 유니코드 공백을 포함해서 제거한다. 자바 11부터 지원
        System.out.println("양쪽 공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(stripLeading): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(stripTrailing): '" + strWithSpaces.stripTrailing() + "'");

    }
}
