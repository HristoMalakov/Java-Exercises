package unit9;

public class NumOccurenceFinder {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,3,4,5,2,3,4,5,4,3};
        int num = 1;
        int numOccurences = occurenceFinder(arr,num);
        System.out.printf("The number %d occurs %d times in the array",num,numOccurences);
    }

    public static int occurenceFinder(int [] arr, int num){
        int numOccurences=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==num){
                numOccurences++;
            }
        }

        return numOccurences;
    }
}
