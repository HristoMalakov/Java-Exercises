import java.util.*;

public class StaticMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("First name:");
		String first = in.nextLine();
		System.out.println("Second name:");
		String last = in.nextLine();
		String a = first;
		
		Stat s = new Stat(first,last);

	}

}
