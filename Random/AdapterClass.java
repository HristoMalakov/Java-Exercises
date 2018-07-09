import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AdapterClass extends JFrame{
     
	private String details;
	private JLabel label;
	
	public AdapterClass(){
		super("title");
		
		details = new String("Default");
		label = new JLabel(details);
		add(label,BorderLayout.SOUTH);
		addMouseListener(new M());
		
	}
	
	public class M extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			
			details = String.format("You clicked %d times",e.getClickCount());
			
			if(e.isMetaDown()){
				details += (" with the right mouse button");
			}
			else if(e.isAltDown()){
				details += (" with the middle mouse button");
			}
			else
				details += (" with the left mouse button");
			label.setText(details);
		}		
	}
}
