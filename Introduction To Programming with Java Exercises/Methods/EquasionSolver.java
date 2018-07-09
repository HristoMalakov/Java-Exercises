package unit9;

import java.util.Scanner;

public class EquasionSolver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a,b,c,d,e,f,g:");
        int a = 12;
        int b = 45;
        int c = 63;
        int d = 24;
        int e = 45;
        int f = 43;
        int g = 32;
        int x = 6;

        System.out.println("The number x for the equasion (a*x*x + b*x + c)*(d*x*x*x + e*x + f*x* +g) = "+equasionSolver(a,b,c,d,e,f,g,x));

    }

    public static double equasionSolver(int a, int b, int c, int d, int e, int f, int g, int x){
        double result = (a*x*x + b*x + c)*(d*x*x*x + e*x + f*x* +g);
        System.out.println((a*x*x + b*x + c));
        System.out.println((d*x*x*x + e*x + f*x* +g));
        return result;
    }
}
