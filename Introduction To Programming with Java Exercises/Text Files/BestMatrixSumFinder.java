package unit15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class BestMatrixSumFinder {

    public static void main(String[] args) throws FileNotFoundException {
        File names = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\Matrix");
        Scanner fileReader = new Scanner(names);
        int bestSum = 0, currentSum = 0;
        int N = fileReader.nextInt();

        //find best sum
        int [][] matrix = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                matrix[i][j] = fileReader.nextInt();
            }
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1; j++){
                currentSum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if(bestSum < currentSum){
                    bestSum = currentSum;
                }
            }
        }

        File bestSumMatrix = new File("C:\\Workspace_Hristo\\Nakov_Java\\src\\unit15\\BestSumMatrix");
        PrintStream fileWriter = new PrintStream(bestSumMatrix);
        fileWriter.println(bestSum);

        if(fileReader != null){
            fileReader.close();
        }
        if(fileWriter != null){
            fileWriter.close();
        }
    }

}
