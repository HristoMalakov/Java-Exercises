import java.io.*;


public class FileClass {

	public static void main(String[] args) {
		
		File x = new File("C:\\Workspace_Hristo\\Bucky72-87_Tutorials\\src\\gjkhgkgkh.java");
        
		if(x.exists()){
			System.out.println(x.getName()+ " exists!");
		}else
			System.out.println(x.getName()+ " doesn't exist!");
	}

}
