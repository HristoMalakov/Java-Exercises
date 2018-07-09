package unit16;

import java.util.Queue;
import java.util.Stack;

public class DynamicStack {

    public static void main(String[] args){
        Stack stack = new Stack();


        for(int i=0; i<10; i++){
            stack.push(i);
        }

        Integer [] arr = stackToArray(stack);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static Integer [] stackToArray(Stack stack){
        Integer [] arr = (Integer[])stack.toArray(new Integer[stack.size()]);

        return arr;
    }
}
