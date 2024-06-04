package exception.ex3;


import exception.ex2.NetworkClientExceptionV2;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV3_1 service = new NetworkServiceV3_1();
        NetworkServiceV3_2 service = new NetworkServiceV3_2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 데이터를 입력하세요: ");
            String data = scanner.nextLine();
            if (data.equals("quit")) {
                break;
            }

            service.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
