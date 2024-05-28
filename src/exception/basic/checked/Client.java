package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { //메서드 밖으로 던질 때 사용하는 키워드(하위랑 차이점 주의)
        //문제 상황
        throw new MyCheckedException("ex"); //새로운 예외 발생시킬 수 있다.
    }
}
