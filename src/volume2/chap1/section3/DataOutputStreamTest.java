package volume2.chap1.section3;

import java.io.*;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/volume2/chap1/section1/test.dat"));
            DataInputStream din = new DataInputStream(new FileInputStream("src/volume2/chap1/section1/test.dat"))) {
            dout.writeByte(12);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeShort(32478);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeChar('a');
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeInt(65536);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeLong(2147483648L);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeBoolean(true);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeFloat(13431.0F);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeDouble(3325415.5);
            dout.writeChars(System.getProperty("line.separator"));
            dout.writeUTF("123456");
            dout.writeChars(System.getProperty("line.separator"));
            System.out.println(din.readByte());
            din.readChar();
            System.out.println(din.readShort());
            din.readChar();
            System.out.println(din.readChar());
            din.readChar();
            System.out.println(din.readInt());
            din.readChar();
            System.out.println(din.readLong());
            din.readChar();
            System.out.println(din.readBoolean());
            din.readChar();
            System.out.println(din.readFloat());
            din.readChar();
            System.out.println(din.readDouble());
            din.readChar();
            System.out.println(din.readUTF());
            din.readChar();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
