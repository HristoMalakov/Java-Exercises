import javax.swing.*;
import java.awt.*;

public class ButtonChecker4 {
	
	public static void main (String[] arg){
		JFrame f = new JFrame("The title");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		
		Panel p1 = new Panel();
		Button b1 = new Button("B0");
		Checkbox cb = new Checkbox("Check me",false);
		p1.add(cb);
		p1.add(b1);
		f.add(p1);
		
		Panel p2 = new Panel();
		for(int i=1;i<6;i++){
			p2.add(new Button("B"+i));
		}
		f.add(p2);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	

}
