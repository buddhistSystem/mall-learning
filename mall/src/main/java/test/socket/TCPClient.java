package test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 65000);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        os.write(new String("hello world").getBytes());
        int ch = 0;
        byte[] buf = new byte[1024];
        ch = is.read(buf);
        String str = new String(buf, 0, ch);
        System.out.println("字符串长度：" + str);
        is.close();
        os.close();
        socket.close();
    }
}
