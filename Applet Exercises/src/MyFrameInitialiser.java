
import javax.swing.*;
import java.awt.event.*;

public class MyFrameInitialiser extends JFrame{
	
	public MyFrameInitialiser(int x, int y, int ln, int ht){
		this.setBounds(x,y,ln,ht);
		this.setVisible(true);
		
		this.setTitle("Graphic window");
		this.addWindowListener(new W());
		
	}
	
	public class W extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			dispose();
		}
	}
	
}






