package headfirstjava.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class MakingAConnection {
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("localhost", 5000);
        try {
            SocketChannel socketChannel = SocketChannel.open(socketAddress);
            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String message = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
