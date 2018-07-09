package unit13;

import java.util.ArrayList;

public class SentenceReverser {

    public static void main(String[] args){
        String str = "C# is not C++ and PHP is not Delphi";
        StringBuilder reversedStr = reverseString(str);
        StringBuilder reversedSentence = reverseWords(reversedStr);
        System.out.println(reversedStr);
        System.out.println(reversedSentence+"is there a space");
    }

    public static StringBuilder reverseString(String str){
        StringBuilder reversedStr = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            reversedStr.append(str.charAt(i));
        }

        return reversedStr;
    }

    public static StringBuilder reverseWords(StringBuilder str){
        StringBuilder sb = new StringBuilder();
        StringBuilder reversedSentence = new StringBuilder();
        char c; int i=0;
        String word = "";
        StringBuilder revWord = new StringBuilder();

        //for(int i=0; i<str.length(); i++){
          while(i<str.length()){
            c = str.charAt(i);

            if(c != ' '){
                sb.append(str.charAt(i));// appendva #C
                System.out.println("sb: "+sb);
                System.out.println("i in the first else if: "+i+" --str.len: "+str.length());
            }
            //else if(i != str.length()){//posleden element ot stringa e

              else{
                word = sb.toString();
                System.out.println("sb.toString(): "+sb.toString()+ " word: "+word);
                sb.setLength(0);
                revWord = reverseString(word);
                reversedSentence.append(revWord);
                reversedSentence.append(" ");
            }
              System.out.println("sb.toString(): "+sb.toString());
            /*else if(i == str.length()-1){// ne vlizame tuk
                word = sb.toString();
                sb.setLength(0);
                System.out.println("i in the second else if: "+i);
                revWord = reverseString(word);
                reversedSentence.append(revWord);
            }*/
            i++;
        }

        return reversedSentence;
    }

    /*public static StringBuilder reverseWords(StringBuilder str){
        StringBuilder reversedSentence = new StringBuilder();
        int stop=0; String subStr = "";

        //emptyBuilder == null || emptyBuilder.toString().equals("")
        while(str != null || !str.toString().equals("")){
            if(str.toString().contains(" ")){
                stop = str.indexOf(" ");
                subStr = str.substring(0, stop);
            }else{
                subStr = str.toString();
            }
            System.out.println(stop);//raboti

            for(int i=subStr.length()-1; i>=0; i--){
                reversedSentence.append(str.charAt(i));
                System.out.println(str.charAt(i));// raboti
            }

            int i = str.indexOf(subStr);
            if (i != -1) {
                //System.out.println(str.substring(0, stop)+"  This is the final operation");
                str.delete(i, i + subStr.length()+1);
            }
            System.out.println(str);
        }

        return reversedSentence;
    }*/

}
