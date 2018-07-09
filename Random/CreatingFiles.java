import java.util.*;


public class CreatingFiles {

	public static void main(String[] args) {
		
		final Formatter f;
		try{
			f = new Formatter("C:\\Workspace_Hristo\\Bucky72-87_Tutorials\\next.txt");
			System.out.println("You created a file");
		}
		catch(Exception e){
			System.out.println("You got an error");
		}

	}

}
