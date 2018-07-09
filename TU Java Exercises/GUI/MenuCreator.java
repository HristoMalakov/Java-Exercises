import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;


public class MenuCreator {
	
	static JFrame f;
	public static void main(String [] args) {
		
		f = new JFrame("Frame 1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuItem mi1 = new MenuItem("add a menu");
		MenuItem mi2 = new MenuItem("remove added menu");
		Menu m = new Menu("Menu 1");
		
		m.add(mi1);
		m.add(mi2);
		
		mi1.addActionListener(new addMenu());
		mi2.addActionListener(new removeMenu());
		
		MenuBar mb = new MenuBar();
		mb.add(m);
		
		f.setSize(300, 250);
		f.setMenuBar(mb);
		f.setVisible(true);
	}
	
	static class addMenu implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			f.getMenuBar().add(new Menu("Menu added"));
		}
	}
	static class removeMenu implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			int len = f.getMenuBar().getMenuCount();
			if(len>1){
				
				Menu m=f.getMenuBar().getMenu(len-1);
				f.getMenuBar().remove(m);
				
			}
		}

	}
}