package volume2.chap1.section2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("src/volume2/chap1/section1/test.dat"), true);
            out.print('a');
            out.println("abc");
//            out.flush();
            System.out.println(out.checkError());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
