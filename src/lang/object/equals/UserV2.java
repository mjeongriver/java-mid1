package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;
    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //객체의 특정 값을 사용하려면 다운캐스팅이 필요하다.
        return id.equals(user.id); //현재 인스턴스(this)에 있는 id 문자열과 비교 대상으로 넘어온 객체의 id 문자열을 비교한다.
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
