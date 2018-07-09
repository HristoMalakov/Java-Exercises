package unit15;

import java.io.*;
import java.util.Scanner;

public class UnevenLinePrinter {

    public static void main(String[] args) throws IOException {
        //String fileName = "C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\TreeMapDemo.txt";
        File file = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\TreeMapDemo.txt");
        Scanner fileReader = new Scanner(file);

        boolean isEven = true;

        while(fileReader.hasNextLine()){
            if(isEven){
                System.out.println(fileReader.nextLine());
            }
            isEven = !isEven;
            //System.out.println(!isEven);
        }

        if(fileReader != null){
            fileReader.close();
        }


    }

}
