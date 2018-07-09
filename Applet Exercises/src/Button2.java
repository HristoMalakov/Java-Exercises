import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Button2 extends Applet{
	
	Button b1,b2;
	TextField tf = new TextField("Click button 1 to hide button 2",50);
	boolean ShowBt2 = true;
	
	public void init(){
		
		setLayout(new FlowLayout());
		b1 = new Button("Bouton 1");
		b2 = new Button("Bouton 2");
		
		add(b1);
		add(b2);
		add(tf);
		
		b1.addActionListener(new B11());
		b1.addActionListener(new B12());
		
	
	}
	
	public class B11 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(ShowBt2){
				tf.setText("Click on button 1 to show button 2");
			}else{
				tf.setText("Click on button 1 to hide button 2");
			}
		}
	}
	public class B12 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(ShowBt2){
				ShowBt2 = false;
				remove(b2);
			}else{
				ShowBt2 = true;
				add(b2);
			}
		}
	}
}