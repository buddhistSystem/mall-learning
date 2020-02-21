package test.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: Administrator
 * @Date: 2019/8/12 0012 15:19
 * @Description:
 */
public class NIOTest {

    /**
     * 使用字节流读取数据
     */
    public static void test1() throws IOException {
        long startTime = System.nanoTime();
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            //System.out.println(new String(bytes, 0, len, "GBK"));
        }
        fileInputStream.close();
        long endTime = System.nanoTime();
        System.out.println("[使用字节流读取数据耗时] " + (endTime - startTime));
    }

    /**
     * 使用字符流读取数据
     */
    public static void test2() throws IOException {
        long startTime = System.nanoTime();
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, "GBK"));
        String str = null;
        while ((str = reader.readLine()) != null) {
            //System.out.println(str);
        }
        reader.close();
        long endTime = System.nanoTime();
        System.out.println("[使用字符流读取数据耗时] " + (endTime - startTime));
    }

    /**
     * 使用NIO从缓冲区读取数据
     */
    public static void test3() throws IOException {
        long startTime = System.nanoTime();
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();

        /** 定义缓冲区大小 */
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        /** 缓冲区设置为读取 */
        buffer.flip();
        /** 将通道的数据读取到缓冲区 */
        channel.read(buffer);
        int len;
        long counts = 0;
        while ((len = channel.read(buffer)) != -1) {
            counts = counts + len;
            byte[] bytes = buffer.array();
            String str = new String(bytes, 0, len, "GBK");
            //System.out.println(str);
            buffer.clear();
        }
        channel.close();
        fileInputStream.close();
        long endTime = System.nanoTime();
        System.out.println("[使用NIO读取数据耗时] " + (endTime - startTime));
    }

    /**
     * 使用字节流写入数据
     */
    public static void test4() throws IOException {
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        /** fileOutputStream 字节流 */
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        /** outputStreamWriter 转换流 */
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        String str = "你好 \nhello world";
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    /**
     * 使用字符流写入数据
     */
    public static void test5() throws IOException {
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        PrintWriter printWriter = new PrintWriter(outputStreamWriter, true);
        String str = "你好 \nhello world";
        printWriter.println(str);
        printWriter.close();
    }

    /**
     * 使用NIO写入数据
     */
    public static void test6() throws IOException {
        File file = new File("C:/Users/Administrator/Desktop/test.txt");
        /** 必须采用RandomAccessFile，并且是rw模式*/
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel fc = raf.getChannel();
        String str = "微信，oracle，mysql，idea";
        ByteBuffer byteBuffer = ByteBuffer.wrap(str.getBytes("GBK"));
        fc.write(byteBuffer);
        fc.close();
        raf.close();
    }


    public static void main(String[] args) throws IOException {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}