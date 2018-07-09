import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		 int h;
	     int m;
		 int s;
		
		T15_1 T15_1Obj = new T15_1();
		
		Scanner inh,inm,ins = new Scanner(System.in);	
		
		System.out.println(T15_1Obj.toMilitary());
		System.out.println(T15_1Obj.toString());

		
		
		T15_1Obj.setTime(15, 15, 15);
		System.out.println(T15_1Obj.toMilitary());
		System.out.println(T15_1Obj.toString());

	}

}
