package unit13;

import java.net.MalformedURLException;
import java.util.Arrays;

public class EscapingSplitter {

    public static void main(String[] args){
        String numbers = "one\\two\\three";
        String result [] = numbers.split("\\\\");
        System.out.println(Arrays.toString(result));
    }

}
