package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //String 사용 시 타입 안정성 부족, 데이터 일관성 부족 -> 런타임 시에만 발견 가능
        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        //오타
        int diamondo = discountService.discount("DIAMONDO", price);
        System.out.println("DIAMONDO 등급의 할인 금액: " + diamondo);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}
