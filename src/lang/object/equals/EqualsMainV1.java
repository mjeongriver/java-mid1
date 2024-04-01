package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        //동일성 비교 - 객체 비교(참조값이 달라서 false)
        System.out.println("identity = " + (user1 == user2));

        //Object가 기본으로 제공하는 equals()는 == 으로 동일성 비교를 제공한다.
        //동등성이라는 개념은 각각의 클래스마다 다르다. 동등성 비교를 사용하고 싶으면 메서드 오버라이딩 사용해야 한다.
        System.out.println("equality =" + (user1.equals(user2)));


    }
}
