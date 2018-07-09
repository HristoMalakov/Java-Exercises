import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseFollowerInit {

	static Image img = Toolkit.getDefaultToolkit().getImage("C1.png");
	static MyCanvas cs = new MyCanvas();

	public static void main(String[] arg) {

		JFrame f = new JFrame("Ex 1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cs.addMouseListener(new MyMouse());
		f.add(cs);
		f.setSize(250, 350);

		cs.setBackground(Color.yellow);
		cs.setForeground(Color.BLUE);

		cs.setFont(new Font("TimesRoman", Font.ITALIC, 24));
		cs.repaint();
		f.setVisible(true);

	}

	static public class MyMouse extends MouseAdapter {

		public void mouseClicked(MouseEvent ev) {

			cs.x = ev.getX();
			cs.y = ev.getY();

			cs.repaint();
			System.out.println("x=" + ev.getX() + " y=" + ev.getY());

		}
	}

	static class MyCanvas extends Canvas {

		int x = 50, y = 70;

		public void paint(Graphics g) {

			g.drawString("This an image", 20, 20);
			g.drawImage(img, x, y, 120, 120, this);

		}
	}
}