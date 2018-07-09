package unit16;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class DFSDirectoryPrinter {

    public static void main(String[] args) {
        String rootName = "C:\\Users";
        File rootDir = new File(rootName);

        listFilesRecursive(rootDir);
    }

    public static void listFilesRecursive(File rootDir){
        File [] listFilesAndDirectories = rootDir.listFiles();

        if(listFilesAndDirectories != null){
            for(File file : listFilesAndDirectories){
                if(file.isDirectory()){
                    listFilesRecursive(file);
                }else{
                    System.out.println(file);
                }
            }
        }
    }

}
