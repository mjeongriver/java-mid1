package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    //익명 클래스는 이름이 없는 지역클래스
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

            //익명 클래스는 클래스의 본문을 정의하면서 동시에 생성
            Printer printer = new Printer() {

            //익명 클래스의 본문
            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}





