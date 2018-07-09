package uni12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BinaryReaderWriter9 {

    public static void main(String... aArgs) throws IOException {
        BinaryReaderWriter9 binary = new BinaryReaderWriter9();
        byte[] bytes = binary.readSmallBinaryFile(FILE_NAME);
        log("Small - size of file read in:" + bytes.length);
        binary.writeSmallBinaryFile(bytes, OUTPUT_FILE_NAME);
    }

    final static String FILE_NAME = "C:\\Workspace_Hristo\\Nakov_Java\\src\\uni12\\Bignor_cottage.JPG";
    final static String OUTPUT_FILE_NAME = "C:\\Workspace_Hristo\\Nakov_Java\\src\\uni12\\Cottage+1+exterior.jpg";

    byte[] readSmallBinaryFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        return Files.readAllBytes(path);
    }

    void writeSmallBinaryFile(byte[] aBytes, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aBytes); //creates, overwrites
    }

    private static void log(Object aMsg){
        System.out.println(String.valueOf(aMsg));
    }

}
