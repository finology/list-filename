import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @description:
 * @author: Simon
 * @date: 2020-09-16 23:46
 */
public class ListFilename {

    public static void main(String[] args) throws IOException {

        Path inPath = Paths.get("/Users/simon/Development/workspace/java/list-filename/src");
        DirectoryStream<Path> paths = Files.newDirectoryStream(inPath);
        Path outPath = Paths.get("/Users/simon/Development/workspace/java/list-filename/src/out.txt");
        OutputStream os = Files.newOutputStream(outPath);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        for (Path path : paths) {
            bw.write(path.toString());
            bw.newLine();
        }
        bw.close();
    }
}
