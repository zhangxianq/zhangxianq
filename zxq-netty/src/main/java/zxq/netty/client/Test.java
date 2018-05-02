package zxq.netty.client;

public class Test {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            new Thread(new HttpClientDemo(),"【this thread】 "+i).start();
        }
    }
}
