import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeltaEncoder {

    public static void main(String args[]){
        ArrayList <Integer> strArr = new ArrayList <Integer> ();
        strArr.add(25626);
        strArr.add(25757);
        strArr.add(24367);
        strArr.add(24267);
        strArr.add(16);
        strArr.add(100);
        strArr.add(2);
        strArr.add(7277);

        //25626,25757,24367,24267,16,100,2,7277
        /*Scanner in = new Scanner(System.in);

        while(in.nextLine() != null){
            strArr.add(in.nextInt());
        }*/

        ArrayList <Integer> deltaEncodedArr = new ArrayList<Integer> ();
        int currentElement=0;
        deltaEncodedArr.add(strArr.get(0));
        for(int i=0; i<strArr.size()-1; i++){
        //while(strArr.get(i+1) != null){
            //float num = float.Parse(strArr.get(i+1));
            currentElement = (int)(strArr.get(i+1))-(int)(strArr.get(i));
            deltaEncodedArr.add(currentElement);
            //System.out.println(deltaEncodedArr.get(i));
        }

        ArrayList <Integer> EscapingEncodedArr = new ArrayList <Integer>();
        currentElement=0;
        int i=1; int c=0;
        EscapingEncodedArr.add(strArr.get(0));
        deltaEncodedArr.add(1020);
        //for(int i=0; i<deltaEncodedArr.size()*2); i++){
        while(c==0){
            if((int)deltaEncodedArr.get(i) >= 127 || (int)deltaEncodedArr.get(i) <= -127){
                currentElement = -128;
                EscapingEncodedArr.add(currentElement);
                currentElement = (int)deltaEncodedArr.get(i);
                EscapingEncodedArr.add(currentElement);
            }else{
                currentElement = (int)deltaEncodedArr.get(i);
                EscapingEncodedArr.add(currentElement);
            }
            i++;
            try{
                deltaEncodedArr.get(i+1);
            }catch (IndexOutOfBoundsException e){
                c++;
            }
        }

        for(int j=0; j<EscapingEncodedArr.size(); j++){
            System.out.println(EscapingEncodedArr.get(j));
        }
    }

}
