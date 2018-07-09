package unit13;

import java.util.Arrays;

public class ForbiddenWordChanger {

    public static void main(String[] args) {
        String str = "Microsoft announced its next generation Java compiler today.\n" +
                "It uses advanced parser and special optimizer for the\n" +
                "Microsoft JVM.";
        String forbiddenWords = "Java,JVM,Microsoft";

        String updatedStr = hideForbiddenWords(str,forbiddenWords);
        System.out.println(updatedStr);
    }

    public static String hideForbiddenWords(String str, String forbiddenWords){
        String updatedStr = str;
        int arrLen = 0;

        String [] forbiddenWordArr = forbiddenWords.split(",");
        for(int i=0; i<forbiddenWordArr.length; i++){
            arrLen = forbiddenWordArr[i].length();
            char[] symbols = new char[arrLen];
            Arrays.fill(symbols, '*');
            updatedStr = updatedStr.replaceAll(forbiddenWordArr[i],new String(symbols));
        }

        return updatedStr;
    }

}
