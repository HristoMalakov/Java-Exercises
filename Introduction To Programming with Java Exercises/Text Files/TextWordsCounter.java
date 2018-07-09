package unit15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TextWordsCounter {

    public static void main(String[] args) throws FileNotFoundException {
        File words = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\words.txt");
        Scanner fileReader = new Scanner(words);
        ArrayList arr = new ArrayList();

        while(fileReader.hasNextLine()){
            arr.add(fileReader.nextLine());
        }

        File text = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\text.txt");
        fileReader = new Scanner(text);

        int [] counters = new int[arr.size()];
        String line = "";

        while(fileReader.hasNextLine()) {
            line = fileReader.nextLine();
            String wordArr[] = line.split("[^\\p{L}]");
            for (int j = 0; j < arr.size(); j++) {
                for (int i = 0; i < wordArr.length; i++) {
                    System.out.println(arr.get(j).toString()+" "+wordArr[i]);
                    if (arr.get(j).toString().toLowerCase().equals(wordArr[i].toLowerCase())) {
                        counters[j]++;
                        System.out.println(counters[j]+"visible?");
                    }
                }
            }
        }

        File result = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\result.txt");
        PrintStream fileWriter = new PrintStream(result);

        for(int i=0; i<arr.size(); i++){
            fileWriter.println(arr.get(i)+": "+counters[i]);
        }
    }

}
