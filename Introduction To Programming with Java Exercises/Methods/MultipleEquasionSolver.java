package unit9;

import java.util.Scanner;

public class MultipleEquasionSolver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which problem would you like to solve: 1,2 or 3?");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Type in the number to reverse");
                int num = sc.nextInt();
                System.out.printf("This is the reversed number: %s", reverseFinder(num));
                break;
            case 2:
                System.out.println("Type in an array of 4 integers:");
                int arr[] = new int[4];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("This is the average of the array: "+averageFinder(arr));
                break;
            case 3:
                System.out.println("Type in a and b:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.printf("For the equasion %d * x + %d = 0, x = %.2f",a,b,equasionSolver(a, b));
                break;
        }
    }

        public static StringBuilder reverseFinder(int num){
            StringBuilder sb = new StringBuilder();

            while(num>0){
               sb.append(num%10);
               num/=10;
            }

            return sb;
        }

        public static double averageFinder(int [] arr){
            double sum=0;

            for(int i=0; i<arr.length;i++){
                sum += arr[i];
            }
            return sum/arr.length;
        }

        public static double equasionSolver(int a, int b){
            return (double)-b/a;
        }
}
