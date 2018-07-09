import java.awt.event.*;
import java.applet.*;
import java.awt.*; 

public class Bouton extends Applet{
	
	 Button b1;
	 Button b2;
	 TextField tf = new TextField("Texte au debut",30);
	
	public void init(){
		
		b1 = new Button("Bouton 1");
		b2 = new Button("Bouton 1");
		
		setLayout(new FlowLayout());
		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		
		add(b1);
		add(b2);
		add(tf);
	
	}
	
	 class B1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tf.setText("Bouton 2");
		}
	}
	 class B2 implements ActionListener {
		public void actionPerformed(ActionEvent e){
			tf.setText("Bouton 1"); 
		}
	}
	
}

















