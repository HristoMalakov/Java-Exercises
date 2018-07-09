import java.util.*;
import java.io.*;

public class ReadingFromFiles {

	private Scanner sc;
	
	public void openFile(){
		try{
		    sc = new Scanner(new File("C:\\Workspace_Hristo\\Bucky72-87_Tutorials\\chinese.text"));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
	public void readFile(){
		
		while(sc.hasNext()){
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			String d = sc.next();
			System.out.printf("%s %s %s %s\n", a,b,c,d);
		}
		
	}
	public void closeFile(){
		sc.close();
	}
	
}
