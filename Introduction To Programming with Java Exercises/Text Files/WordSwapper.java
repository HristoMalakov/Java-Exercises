package unit15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordSwapper {

    public static void main(String[] args) throws FileNotFoundException {
        File start = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\Start");
        Scanner fileReader = new Scanner(start);
        ArrayList arr = new ArrayList();
        String swapper = "finish";
        String swapped = "start";
        String line = "";

        while(fileReader.hasNextLine()){
            line = fileReader.nextLine();
            arr.add(line.replaceAll(swapped,swapper));
        }

        File finish = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\Finish");
        PrintStream fileWriter = new PrintStream(finish);

        for(int i=0; i<arr.size(); i++){
            fileWriter.println(arr.get(i));
        }

        if(fileReader != null){
            fileReader.close();
        }
        if(fileWriter != null){
            fileWriter.close();
        }
    }

}
