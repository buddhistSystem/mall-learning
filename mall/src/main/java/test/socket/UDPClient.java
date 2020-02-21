package test.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        byte[] sendByte = "hello world".getBytes();
        DatagramPacket packet = new DatagramPacket(sendByte, sendByte.length, address, 65000);
        socket.send(packet);

        byte[] receivedData = new byte[200];
        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        socket.receive(receivedPacket);
        String receiveStr = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println("字符串长度为：" + receiveStr);
    }
}
