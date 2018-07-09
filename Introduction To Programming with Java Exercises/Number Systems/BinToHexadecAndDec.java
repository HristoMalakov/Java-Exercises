package unit8;

import java.util.Arrays;

import java.util.Scanner;

public class BinToHexadecAndDec {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.print("N = ");

        StringBuilder binNum = new StringBuilder("1111010110011110");
        int decNum = binToDecConverter(binNum);
        StringBuilder hexadecNum = binToHexadecConverter(binNum);
        //String hexadecNum = Arrays.toString(hexadecArr);

        System.out.printf("The binary number %s is %d is decimal and" +
                " %s in hexadecimal.",binNum,decNum,hexadecNum);
    }

    public static int binToDecConverter(StringBuilder binNum){
        int decNum=0;
        int [] decNumArr = new int [binNum.length()];
        String[] numbers = binNum.toString().split("");

        for(int i=0; i<binNum.length();i++){
            decNumArr[i] = Integer.valueOf(numbers[i]);
            decNum += decNumArr[i] * Math.pow(2, binNum.length() - i - 1);
            //System.out.printf("\nDecNum: "+decNum +"  Power: "+(decNumArr.length-i-1)+"  decNumArr[i]: "+decNumArr[i] );
        }
        return decNum;
    }

    public static StringBuilder binToHexadecConverter(StringBuilder binNum){
        char [] hexadecNum = new char [binNum.length()/4];
        int k=0;
        for(int i=0; i<binNum.length()/4; i++){
            //hexadecNum[i]=binNum.substring(k,k+4);
            switch (binNum.substring(k,k+4)){
                case "0000":
                    hexadecNum[i] = '0'; break;
                case "0001":
                    hexadecNum[i] = '1'; break;
                case "0010":
                    hexadecNum[i] = '2'; break;
                case "0011":
                    hexadecNum[i] = '3'; break;
                case "0100":
                    hexadecNum[i] = '4'; break;
                case "0101":
                    hexadecNum[i] = '5'; break;
                case "0110":
                    hexadecNum[i] = '6'; break;
                case "0111":
                    hexadecNum[i] = '7'; break;
                case "1000":
                    hexadecNum[i] = '8'; break;
                case "1001":
                    hexadecNum[i] = '9'; break;
                case "1010":
                    hexadecNum[i] = 'A'; break;
                case "1011":
                    hexadecNum[i] = 'B'; break;
                case "1100":
                    hexadecNum[i] = 'C'; break;
                case "1101":
                    hexadecNum[i] = 'D'; break;
                case "1110":
                    hexadecNum[i] = 'E'; break;
                case "1111":
                    hexadecNum[i] = 'F'; break;
            }
            k+=4;
        }

        StringBuilder hexadecNumStr = new StringBuilder();

        for(int i=0; i<hexadecNum.length;i++){
            hexadecNumStr.append(hexadecNum[i]);
        }

        return hexadecNumStr;
    }
}