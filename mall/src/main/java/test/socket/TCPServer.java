package test.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        //创建socket，并绑定到65000端口
        ServerSocket ss = new ServerSocket(65000);
        while (true){
            Socket socket =ss.accept();
            new LengthCalculator(socket).start();
        }
    }
}
