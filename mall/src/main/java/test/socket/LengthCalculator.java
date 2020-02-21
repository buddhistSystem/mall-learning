package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
编写一个网络应用程序，有客户端和服务端，客户端向服务器发送一个字符串，
服务器收到该字符串后将其打印在命令行上，然后向客户端返回该字符串的长度，
最后客户端输出服务器端返回的该字符串的长度，分别用TCP和UDP方式实现
 */
public class LengthCalculator extends Thread {
    private Socket socket;
    public LengthCalculator(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            int ch = 0;
            byte[] buf = new byte[1024];
            ch = is.read(buf);
            String str = new String(buf, 0, ch);
            System.out.println("服务端收到的字符串为：" + str);
            os.write(String.valueOf(str.length()).getBytes());
            is.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
