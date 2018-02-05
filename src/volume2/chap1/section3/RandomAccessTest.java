package volume2.chap1.section3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("/home/hanqi/mysrc/java/corejava/src/volume2/chap1/section3/test.dat", "rw")) {
            long length = file.length();
            System.out.println("the length is: " + length);
            file.seek(3);
            long pointer = file.getFilePointer();
            System.out.println("the pointer is at: " + pointer);
            System.out.println("current char: " + (char) file.readByte());
            System.out.println("next char: " + (char) file.readByte());
            file.seek(3);
            file.writeByte('a');
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
