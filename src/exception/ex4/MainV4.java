package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {

        NetworkServiceV4 service = new NetworkServiceV4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 데이터를 입력하세요: ");
            String data = scanner.nextLine();
            if (data.equals("quit")) {
                break;
            }

            //exception 공통 처리
            try {
                service.sendMessage(data);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리
        //실무에서는 Slf4J, logback 로깅 라이브러리 사용함
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("개발자용 디버깅 메세지");
        e.printStackTrace(System.out); //스택 트레이스 표준 출력
        //e.printStackTrace(System.err); //콘솔에 빨간색으로 뜸

        //필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
