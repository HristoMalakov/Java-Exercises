import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class ButtonChecker2 extends JFrame{
	
	static JFrame f;
	public static void main (String[] arg){
	     
		f = new JFrame("Title");
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel p = new Panel();
		Button bt = new Button("BT");
		bt.addActionListener(new BT());
		Checkbox cb = new Checkbox("Click this, please",false);
		
		p.add(cb);
		p.add(bt);
		f.add(p);
	}
	
	static class Button implements ActionListener{
		public void actionPerformed(ActionEvent event){
			TextField tf = new TextField("Would you explain why you clicked it?");
			f.add(tf);
		}
	}

}