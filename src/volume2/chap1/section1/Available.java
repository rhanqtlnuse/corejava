package volume2.chap1.section1;

import java.io.DataInputStream;
import java.io.IOException;

public class Available {
    public static void main(String[] args) {
        try (DataInputStream din = new DataInputStream(System.in)) {
            // 读取一个字节
            byte aByte;
            aByte = din.readByte();
            System.out.println(toBinary(aByte) + " " + aByte);
            // 查看还有多少可读字节，不会阻塞等待输入
            int bytesAvailable = din.available();
            if (bytesAvailable > 0) {
                byte[] data = new byte[bytesAvailable];
                din.read(data);
                for (byte b : data) {
                    System.out.println(toBinary(b) + " " + b);
                }
            } else {
                System.out.println("no available bytes");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static String toBinary(int number) {
        String ret = Integer.toBinaryString(number);
        int diff = 8 - ret.length();
        for (int i = 0; i < diff; i++) {
            ret = "0" + ret;
        }
        return ret;
    }
}
