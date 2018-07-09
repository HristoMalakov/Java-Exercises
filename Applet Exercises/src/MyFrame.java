import java.util.*;
import java.awt.*;

   public class MyFrame{
	   
	   public static void main(String [] args){
		   
		   MyFrameInitialiser mf = new MyFrameInitialiser(50,50,200,200);
		   Scanner in = new Scanner(System.in);
  
		   System.out.println("Enter new name");
		   mf.setTitle(in.nextLine());
		    
		   System.out.println("Enter new length");
		   int ln = Integer.parseInt(in.nextLine());
		   
		   System.out.println("Enter new height");
		   int ht = Integer.parseInt(in.nextLine());
		   
		   mf.setSize(ln,ht);
		   
		   System.out.println("Enter to make it invisible");
		   in.nextLine();
		   mf.setVisible(false);
		   
		   System.out.println("Enter to make it visible");
		   in.nextLine();
		   mf.setVisible(true);
		   
		   System.out.println("Enter to make it disappear");
		   in.nextLine();
		   System.exit(0);
		   	   
	   }
	   
   }