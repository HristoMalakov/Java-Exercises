package unit8;

import java.util.Arrays;

public class DecToBin {

    public static void main(String[] args) {

        int decNum = 1;
        StringBuilder binStr = decToBin(decNum);
        System.out.printf("The number %d in decimal is equal to %s in binary",decNum,binStr);
    }

    public static StringBuilder decToBin(int decNum){
        int i=0;
        int decNumTemp = decNum;

        StringBuilder binStr = new StringBuilder();

        while(decNumTemp > 0){
            binStr.append(decNumTemp%2);
            decNumTemp /= 2;
            i++;
        }

        return binStr;
    }
}
