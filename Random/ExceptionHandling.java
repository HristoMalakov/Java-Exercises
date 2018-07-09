import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x=0;
		do{
        try{
        	System.out.println("Type in a number:");
        	int a = in.nextInt();
        	System.out.println("Type in a number:");
        	int b = in.nextInt();
        	int sum = a/b;
        	System.out.println(sum);
        	x++;
        }
        catch(Exception e){
        	System.out.println("Error. Try again, Lucy.");
        }
		}while(x==0);
		
	}

}
