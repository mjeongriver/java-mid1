package enumeration.ex1;

public class DiscountService {

    //StringGrade를 참고하세요.
    public int discount(String grade, int price) {
        int discouintPercent = 0;

        if(grade.equals(StringGrade.BASIC)) {
            discouintPercent = 10;
        } else if(grade.equals(StringGrade.GOLD)) {
            discouintPercent = 20;
        } else if(grade.equals(StringGrade.DIAMOND)) {
            discouintPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }

        //10000 * (20 / 100) = 2000
        return price * discouintPercent / 100;
    }
}
