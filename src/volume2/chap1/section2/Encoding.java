package volume2.chap1.section2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class Encoding {
    public static void main(String[] args) {
        String s = "encoding and decoding test by 韩琦";
        Charset cset = Charset.forName("UTF-8");
        ByteBuffer buffer = cset.encode(s);
        byte[] bytes = buffer.array();
        for (byte b : bytes) {
            System.out.println(b);
        }

        ByteBuffer bbuf = ByteBuffer.wrap(bytes);
        CharBuffer cbuf = cset.decode(bbuf);
        String str = cbuf.toString();
        System.out.println(str);
    }
}
