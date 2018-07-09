package unit9;

import java.util.Scanner;

public class MaxNumFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 3 nums:");
        int [] nums = new int [3];
        for(int i=0; i< nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int maxNum = getMax(nums);
        System.out.printf("The biggest among them is:%d",maxNum);
    }

    public static int getMax(int [] nums){
        int maxNum = 0;

        for(int i=0; i<nums.length; i++){
            if(maxNum < nums[i]){
                maxNum = nums[i];
            }
        }

        return maxNum;
    }

}
