package unit9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumReverser {

    public static void main(String[] args) {
        int N=256;
        StringBuilder reverseN = numReverser(N);
        System.out.printf("The number %d is %s reversed.",N,reverseN);
    }

    public static StringBuilder numReverser(int N){

        StringBuilder reverseN = new StringBuilder();

        while(N>0){
            reverseN.append(N%10);
            N/=10;
        }

        return reverseN;
    }

}
