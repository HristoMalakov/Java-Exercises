import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CanvasInit {

	public static void main(String[] arg) {

		JFrame f = new JFrame("Ex 1");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyCanvas cs = new MyCanvas();

		f.add("Center", cs);
		f.setSize(250, 350);

		cs.setBackground(Color.YELLOW);
		cs.setForeground(Color.BLUE);

		cs.setFont(new Font("TimesRoman", Font.ITALIC, 24));
		cs.repaint();
		f.setVisible(true);
	}

}

class MyCanvas extends Canvas {

	int iw = 100, ih = 100;
	Image img = Toolkit.getDefaultToolkit().getImage("C1.png");

	public void paint(Graphics g) {

		g.drawString("This an image", 20, 20);
		g.drawImage(img, iw, ih, 120, 120, this);

	}
}