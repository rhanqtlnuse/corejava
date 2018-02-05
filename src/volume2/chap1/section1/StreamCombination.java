package volume2.chap1.section1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamCombination {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/hanqi/mysrc/java/corejava/src/volume2/chap1/section1/test.dat");
            DataInputStream din = new DataInputStream(fin);
            int tmp;
            while ((tmp = din.read()) != -1) {
                System.out.println(Available.toBinary(tmp) + " " + tmp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
