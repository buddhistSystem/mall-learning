package test.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(65000);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        byte[] data = packet.getData();
        String str = new String(data, 0, packet.getLength());
        System.out.println("服务端收到的字符串为：" + str);

        byte [] sendStr = String.valueOf(str.length()).getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendStr,sendStr.length,packet.getAddress(),packet.getPort());
        socket.send(sendPacket);
    }
}
