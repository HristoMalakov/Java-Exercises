import java.applet.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class CardEx1 extends Canvas {
	Image Card[] = new Image[5];
	int wh = 70, ht = 100;
	int vX[] = new int[Card.length];
	int vY[] = new int[Card.length];
	boolean back[] = new boolean[Card.length];
	boolean ctch[] = new boolean[Card.length];
	int helpX, helpY, clicks;

	public static void main(String[] arg) {
		JFrame fr = new JFrame("Card example");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400, 400);
		fr.setVisible(true);
		CardEx ce = new CardEx();
		fr.add(ce);
		ce.init();

	}

	public void init() {
		setBackground(Color.green);
		for (int i = 0; i < Card.length; i++) {
			Card[i] = Toolkit.getDefaultToolkit().getImage("C" + i + ".jpg");
			vX[i] = 20 + 55 * i;
			vY[i] = 30;
			back[i] = ctch[i] = false;
		}
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}

	class MouseHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			helpX = e.getX();
			helpY = e.getY();
			for (int i = 0; i < Card.length; i++) {
				if (chckIn(i, helpX, helpY)) {
					ctch[i] = true;
					if (e.getClickCount() == 2) {
						if (back[i])
							Card[i] = Toolkit.getDefaultToolkit().getImage("C" + i + ".jpg");
						else
							Card[i] = Toolkit.getDefaultToolkit().getImage("Cback.jpg");
						back[i] = !back[i];
						repaint(vX[i], vY[i], wh, ht);
					}
				}
			}
			clicks = e.getClickCount();
			repaint();
		}

		public void mouseReleased(MouseEvent e) {
			for (int i = 0; i < Card.length; i++)
				ctch[i] = false;
			repaint();
		}
	}

	class MouseMotionHandler extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			for (int i = 0; i < Card.length; i++)
				if (ctch[i]) {
					vX[i] += (x - helpX);
					vY[i] += (y - helpY);
					repaint(vX[i], vY[i], wh, ht);
					helpX = x;
					helpY = y;
				}
		}
	}

	public void paint(Graphics g) {
		for (int i = 0; i < Card.length; i++) {
			g.drawImage(Card[i], vX[i], vY[i], wh, ht, this);
			g.drawRect(vX[i], vY[i], wh, ht);
		}
	}

	boolean chckIn(int ncard, int x, int y) {
		if ((x > vX[ncard]) && (x < vX[ncard] + wh) && (y > vY[ncard]) && (y < vY[ncard] + ht))
			return true;
		return false;
	}
}