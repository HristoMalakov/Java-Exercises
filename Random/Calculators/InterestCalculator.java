import java.util.Scanner;
public class InterestCalculator {
	 
	
	public static void main(String[] args){
		
		double rate=0.06;
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you deposit per year?");
		 int cheque = in.nextInt();
		 System.out.println("How many years would you like to deposit them?");
		 int year = in.nextInt();
		
		for(int i=1; i<(year+1); i++){
	    
	    //currentM += (int)(cheque*Math.pow( 1+rate,i));
	    System.out.println( "For "+i+" years:" + "\t"+(int)(cheque*Math.pow( 1+rate,i))  );
		}
	}
}
