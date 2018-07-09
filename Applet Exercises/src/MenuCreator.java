import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuCreator extends JFrame{
	
	static JFrame f;
	static int w=300,h=300;
	
	public static void main(String[]  args){
		f = new JFrame("Frame");
		f.setSize(w,h);
		f.setVisible(true);
		f.addWindowListener(new Wl());
		
		Button b1 = new Button("Inc 10%"),b2 = new Button("Dec 10%");
		b1.addActionListener(new Inc());
		b2.addActionListener(new Dec());
		f.add(b1);
		f.add(b2);
		
		
		Menu m = new Menu("Menu");
		MenuBar mb = new MenuBar();
		MenuItem mi1 = new MenuItem("Inc 10%");
		MenuItem mi2 = new MenuItem("Dec 10%");
		
		mi1.addActionListener(new Inc());
		mi2.addActionListener(new Dec());
		m.add(mi1);
		m.add(mi2);
		mb.add(m);
		
		f.setMenuBar(mb);
		f.setLayout(new FlowLayout());
	
	}
	
	static class Wl extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	static class Inc implements ActionListener{
		public void actionPerformed(ActionEvent e){
			w+=w/10;
			h+=h/10;
			f.setSize(w,h);
		}
	}
	static class Dec implements ActionListener{
		public void actionPerformed(ActionEvent e){
			w-=w/10;
			h-=h/10;
			f.setSize(w,h);
		}
	}
}