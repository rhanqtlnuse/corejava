package volume2.chap1.section4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest {
    public static void main(String[] args) {
        try (ZipOutputStream zout = new ZipOutputStream(
                new FileOutputStream("/home/hanqi/mysrc/java/corejava/src/volume2/chap1/section4/test.zip"))) {
            for (int i = 0; i < 5; i++) {
                ZipEntry entry = new ZipEntry("file" + i + ".txt");
                zout.putNextEntry(entry);
                zout.write(i);
                zout.closeEntry();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ZipInputStream zin = new ZipInputStream(
                new FileInputStream("/home/hanqi/mysrc/java/corejava/src/volume2/chap1/section4/test.zip"))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                System.out.println(entry.toString());
                System.out.println(entry.getMethod());
                System.out.println(entry.getCrc());
                System.out.println(zin.read());
                zin.closeEntry();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ZipFile file = new ZipFile("/home/hanqi/mysrc/java/corejava/src/volume2/chap1/section4/test.zip")) {
            System.out.println(file.getName());
            ZipEntry entry = file.getEntry("file1.txt");
            System.out.println(entry);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
