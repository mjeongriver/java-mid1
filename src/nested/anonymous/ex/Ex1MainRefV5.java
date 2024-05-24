package nested.anonymous.ex;

import java.util.Random;

public class Ex1MainRefV5 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        //람다로 변환(함수를 인수로 전달)
        //익명 클래스는 멤버변수 선언 가능, 람다는 불가능
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });

    }
}
