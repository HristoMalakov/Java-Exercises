import java.io.*;
import java.util.*;
import java.lang.*;


public class WritingToFiles {

	private Formatter f;
	
	public void openFile(){
		try{
			f = new Formatter("chinese.text");
			System.out.println("You created a file");
		}
		catch(Exception e){
			System.out.println("Error");
		}	
	}
	 public void addRecords(){
		f.format("%s %s %s\n%s %s %s\n%s %s %s",
				"Hristo ","Malakov, ","age 20",
				"Luchezar ","Malakov, ","age 48",
				"Maria ","Digbazova, ","age 49");
		
	 }
	 public void closeFile(){
		 f.close();
	 }
	
}
