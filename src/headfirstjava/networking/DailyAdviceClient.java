package headfirstjava.networking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class DailyAdviceClient {
    public static void main(String[] args) {
        try {
            SocketChannel svr = SocketChannel.open(new InetSocketAddress("localhost",5001));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
