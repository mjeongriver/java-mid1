package exception.ex2;


import exception.ex1.NetworkServiceV1_3;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV1_1 service = new NetworkServiceV1_1();
        //NetworkServiceV1_2 service = new NetworkServiceV1_2();
        NetworkServiceV2_1 service = new NetworkServiceV2_1();

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
