
package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) { //사용할 자원을 명시
            //정상 흐름 모아서 해결
            client.initError(data);
            client.connect();
            client.send(data);
            //close 자동 실행 
        } catch (Exception e) {
            System.out.println("[예외 확인] 메시지: " + e.getMessage());
            throw e;
        }

    }
}
