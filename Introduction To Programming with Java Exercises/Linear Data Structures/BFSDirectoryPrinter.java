package unit16;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class BFSDirectoryPrinter {

    public static void main(String[] args) {
        String rootDir = "C:\\Users";
        Queue<File> queue = new LinkedList();
        ((LinkedList<File>) queue).add(new File(rootDir));

        while(!queue.isEmpty()){
            File current = queue.poll();
            File [] listFilesAndDirectories = current.listFiles();

            if(listFilesAndDirectories != null){
                for(File file : listFilesAndDirectories){
                    if(file.isDirectory()){
                        queue.add(file);
                    }else{
                        System.out.println(file);
                    }
                }
            }
        }
    }

}
