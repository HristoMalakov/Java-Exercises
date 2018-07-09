import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		double a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Type in a and b:");
		a = in.nextDouble();
		b = in.nextDouble();
		int i=0;
		do{
		System.out.println("Multiplication, Division, Substraction or Attraction?(m,d,s,a)");
		
		char c = in.next().charAt(0); //to get a char
		
		
			
		switch(c){
		case 'm':
			System.out.println(a*b);break;
		case 'd':
			System.out.println(a/b);break;
		case 's':
			System.out.println(a-b);break;
		case 'a':
			System.out.println(a+b);break;
		
		}
		System.out.println("Another problem?(y/n)");
		char g = in.next().charAt(0);
		if(g == 'n'){
			i=1;
		}
		
		
		}while(i==0);
		System.out.println("Thank you for using Moulashkalator 2017!");

	}

}
