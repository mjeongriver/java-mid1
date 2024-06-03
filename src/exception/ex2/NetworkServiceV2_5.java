
package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            //정상 흐름 모아서 해결
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            //예외를 밖으로 던져도 finally 호출이 보장된다.
            client.disconnect();
        }

    }
}
