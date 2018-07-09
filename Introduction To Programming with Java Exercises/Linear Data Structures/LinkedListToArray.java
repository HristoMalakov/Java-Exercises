package unit16;

import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args){
        LinkedList <Integer> list = new <Integer>LinkedList();

        for(int i=0; i<10; i++){
            list.add(i);
        }

        list.removeFirst();
        System.out.println(list.indexOf(5));
        list.set(4,112);
        System.out.println(list.get(4));

        Integer [] arr = convertToArray(list);
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static Integer [] convertToArray(LinkedList list){
        Integer [] arr  = (Integer[])list.toArray(new Integer[list.size()]);

        return arr;
    }

}
