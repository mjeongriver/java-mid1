package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {

    public static void main(String[] args) {
        //현재 시간(밀리초)을 가져온다
        long currentTime = System.currentTimeMillis();
        System.out.println("currentTime = " + currentTime);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("nanoTime = " + currentTimeNano);

        //환경 변수를 읽는다.
        System.out.println("getenv= " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties= " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'a', 'b', 'c'};
        char[] copiedArray = new char[3];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0); //0은 정상 종료, 0이 아닐 경우 오류나 예외적인 종료 -> 가급적 사용을 권장하지 않음
        System.out.println("hello");
    }
}
