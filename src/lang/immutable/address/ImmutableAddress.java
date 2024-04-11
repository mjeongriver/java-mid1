package lang.immutable.address;

public class ImmutableAddress {

    //불변 객체
    //value 필드 final 선언 -> 의도 명확
    //값을 변경할 수 있는 setValue() 제거
    private final String value; 

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
