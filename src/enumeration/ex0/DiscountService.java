package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        int discouintPercent = 0;

        if(grade.equals("BASIC")) {
            discouintPercent = 10;
        } else if(grade.equals("GOLD")) {
            discouintPercent = 20;
        } else if(grade.equals("DIAMOND")) {
            discouintPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }

        //10000 * (20 / 100) = 2000
        return price * discouintPercent / 100;
    }
}
