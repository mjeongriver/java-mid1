package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object object) {
        String string = "객체 정보 출력: " + object.toString();
        //자바 언어가 기본으로 제공하는 다양한 메서드들은 개발자가 필요에 따라 오버라이딩 해서 사용할 수 있도록 설계되어 있다.
        System.out.println(string);
    }
}
