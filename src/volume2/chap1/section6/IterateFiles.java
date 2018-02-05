package volume2.chap1.section6;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class IterateFiles {
    public static void main(String[] args) {
        Path path = Paths.get("/home/hanqi/mysrc/java/corejava");
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(path, "**.java")) {
            for (Path entry : entries) {

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attributes) throws IOException {
                    System.out.println(path);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
