package unit8;

import java.util.Arrays;

public class DecToHexadec {

    public static void main(String[] args) {
        int decNum = 1003;
        StringBuilder hexadecStr = decToHexadec(decNum);
        System.out.printf("The number %d in decimal is equal to %s in hexadecimal",decNum,hexadecStr);
    }

    public static StringBuilder decToHexadec(int decNum){
        int decNumTemp = decNum;
        StringBuilder hexadecStr = new StringBuilder();

        while(decNumTemp > 0){
            if(decNumTemp%16 >= 10){
                switch(decNumTemp%16){
                    case 10:
                        hexadecStr.insert(0,"A"); break;
                    case 11:
                        hexadecStr.insert(0,"B"); break;
                    case 12:
                        hexadecStr.insert(0,"C"); break;
                    case 13:
                        hexadecStr.insert(0,"D"); break;
                    case 14:
                        hexadecStr.insert(0,"E"); break;
                    case 15:
                        hexadecStr.insert(0,"F"); break;
                }
            }else {
                hexadecStr.insert(0,decNumTemp % 16);
            }
            decNumTemp /= 16;
        }

        return hexadecStr;
    }
}