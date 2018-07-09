//: BoutonD.java 
// gestion de la pression d'un  bouton 


/*Le programme suivant illustre une possibilité intéressante:
 *  d'avoir une classe qui pourrait être lancée soit comme 
 *  application soit comme applet. Pour faire ça on doit ajouter
 *   une méthode  main() et de construire une instance Applet dans
 *    une frame.*/



import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;

   public class Button1 extends Applet{
	   
	   TextField t = new TextField("Texte initiale");
	   Button bt1 = new Button("Bt1"),bt2 = new Button("Bt2");
	   
	   public void init(){
		   
		   bt1.addActionListener(new B1());
		   bt2.addActionListener(new B2());
		   
		   add(bt1);
		   add(bt2);
		   add(t);
		   
		   setLayout(new FlowLayout());
		   
	   }
	   
	   public class B1 implements ActionListener{
		   public void actionPerformed(ActionEvent e){
			   t.setText("Bt1");
		   }
	   }
	   
	   public class B2 implements ActionListener{
		   public void actionPerformed(ActionEvent e){
			   t.setText("Bt2");
		   }
	   }
	   
	   public static void main(String args[]){
		   
		   JFrame f = new JFrame();
		   Bt Obj = new Bt();
		   
		   f.add(Obj);
		   
		   f.setSize(300, 300);
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   f.setVisible(true);
		   
		   Obj.init();
		   Obj.start();   
	   }	   
	   
   }



