
package unit10;

public class SingleSumFinder {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9,0};
        int N = 5;
        int currentSum;




        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i];
            //for(int g=0; g<arr.length;g++) {
            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == N) {
                    System.out.print("We found a sum: " + arr[i]);
                    for (int k = i + 1; k < j + 1; k++) {
                        System.out.print("+" + arr[k]);
                    }
                    System.out.println();
                }
            }
            //System.out.println(currentSum);
            //}

        }

    }

}
