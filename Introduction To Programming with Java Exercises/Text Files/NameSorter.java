package unit15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {

    public static void main(String[] args) throws FileNotFoundException {
        File names = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\Names");
        Scanner fileReader = new Scanner(names);
        ArrayList namesArr = new ArrayList();

        while(fileReader.hasNextLine()){
            namesArr.add(fileReader.nextLine());
        }

        Collections.sort(namesArr);

        File sortedNames = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\NamesSorted");
        PrintStream fileWriter = new PrintStream(sortedNames);
        for(int i=0; i<namesArr.size(); i++){
            fileWriter.println(namesArr.get(i));
        }

        if(fileReader != null){
            fileReader.close();
        }
        if(fileWriter != null){
            fileWriter.close();
        }
    }

}
