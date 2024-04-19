package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {

        //StringBuilder를 직접 사용하는 것이 더 좋은 경우
        //반복문, 조건문, 복잡할 때, 대용량 문자열
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< 100000; i++) {
            sb.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();
        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");

    }
}
