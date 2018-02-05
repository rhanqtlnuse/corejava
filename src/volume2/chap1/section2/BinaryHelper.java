package volume2.chap1.section2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryHelper {
    public static void main(String[] args) {
        try (DataInputStream din = new DataInputStream(
                new FileInputStream("src/volume2/chap1/section1/test.dat"))) {
            int bytesAvailable = din.available();
            if (bytesAvailable > 0) {
                byte[] data = new byte[bytesAvailable];
                for (int i = 0; i < data.length; i++) {
                    if (data[i] != '\n') {
                        System.out.print(toHex(data[i]) + " ");
                    } else {
                        System.out.println();
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static String toHex(byte b) {
        final byte ONE = 1;
        final String ALPHABET = "0123456789ABCDEF";
        StringBuilder sb = new StringBuilder();
        int hex = 0;
        for (int i = 0; i < 8; i++) {
            int bit = b & (ONE << (7 - i));
            if (bit == 1) {
                hex += (int) Math.pow(2, i % 4);
                if ((i + 1) % 4 == 0) {
                    sb.append(ALPHABET.charAt(hex));
                    hex = 0;
                }
            }
        }
        return sb.toString();
    }
}
