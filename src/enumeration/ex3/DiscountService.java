package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discouintPercent = 0;

        if(classGrade == BASIC) { //상수니까 static import로 사용 가능
            discouintPercent = 10;
        } else if(classGrade == GOLD) {
            discouintPercent = 20;
        } else if(classGrade == DIAMOND) {
            discouintPercent = 30;
        } else {
            System.out.println(classGrade + ": 할인 X");
        }

        //10000 * (20 / 100) = 2000
        return price * discouintPercent / 100;
    }
}
