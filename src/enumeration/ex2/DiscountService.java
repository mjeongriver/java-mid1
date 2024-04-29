package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discouintPercent = 0;

        if(classGrade == ClassGrade.BASIC) {
            discouintPercent = 10;
        } else if(classGrade == ClassGrade.GOLD) {
            discouintPercent = 20;
        } else if(classGrade == ClassGrade.DIAMOND) {
            discouintPercent = 30;
        } else {
            System.out.println(classGrade + ": 할인 X");
        }

        //10000 * (20 / 100) = 2000
        return price * discouintPercent / 100;
    }
}
