package unit16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListSorter {

    public static void main(String[] args) {
        LinkedList<Integer> list = new <Integer>LinkedList();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(50) + 1);
        }

        LinkedList sortedList = listSort(list);
        System.out.println(sortedList.toString());
    }

    public static LinkedList listSort(LinkedList list){
        LinkedList sortedList = list;
        Collections.sort(sortedList);

        /*for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size()-1; j++){
                if(list. < list.){

                }
            }
        }*/

        return sortedList;
    }
}
