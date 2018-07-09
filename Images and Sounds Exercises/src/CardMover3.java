import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



class CardObj {
	Image card, cardBack;
	int vx, vy;
	static int cLen = 70, cHeight = 100;
	boolean back;

	CardObj(int num, int x, int y, CardEx2 passEx) {
		card = Toolkit.getDefaultToolkit().getImage("C" + num + ".jpg");
		cardBack = Toolkit.getDefaultToolkit().getImage("Cback.jpg");
		vx = x;
		vy = y;
		back = false;
	}

	void draw(Graphics g, CardEx2 passEx) {
		if (!back)
			g.drawImage(card, vx, vy, cLen, cHeight, passEx);
		else
			g.drawImage(cardBack, vx, vy, cLen, cHeight, passEx);
		g.drawRect(vx, vy, cLen, cHeight);

	}
}



class PileCard extends Stack {
	int vx, vy;

	PileCard(int x, int y) {
		vx = x;
		vy = y;
	}

	boolean dansPile(int x, int y) {
		if ((x > vx) && (x < vx + CardObj.cLen))
			if ((y > vy) && (y < vy + CardObj.cHeight))
				return true;
		return false;
	}

	void push(CardObj card) {
		card.vx = vx;
		card.vy = vy;
		card.back = !card.back;
		super.push(card);

	}

}



class TablCard extends Vector {
	int vx, vy;
	static int dist = 10;

	TablCard(int x, int y, int d) {
		vx = x;
		vy = y;
		dist = d;
	}

	int indTabl(int x, int y) {
		for (int i = 0; i < size(); i++) {
			if ((x > vx + i * (CardObj.cLen + dist)) && (x < vx + i * (CardObj.cLen + dist) + CardObj.cLen))
				if ((y > vy) && (y < vy + CardObj.cHeight))
					return i;
		}
		return -1;
	}

	void addElement(CardObj card) {
		card.vx = vx + size() * (CardObj.cLen + dist);
		card.vy = vy;
		super.addElement(card);
	}

	void deleteAt(int i) {
		for (int k = i + 1; k < size(); k++)
			((CardObj) get(k)).vx -= CardObj.cLen + dist;
		super.removeElementAt(i);
	}

	void draw(Graphics g, CardEx2 place) {
		for (int i = 0; i < size(); i++)
			((CardObj) get(i)).draw(g, place);
	}
}



public class CardMover extends Canvas {
	PileCard pileDep, pileDest;
	TablCard bureau;

	public void init() {
		setBackground(Color.green);
		pileDep = new PileCard(20, 20);
		pileDest = new PileCard(200, 20);
		bureau = new TablCard(20, 200, 10);
		for (int i = 0; i < 5; i++)
			pileDep.push(new CardObj(i, pileDep.vx, pileDep.vy, this));
		addMouseListener(new MouseHandler());
	}

	public void paint(Graphics g) {
		if (!pileDep.empty()) {
			((CardObj) pileDep.peek()).draw(g, this);
		}
		if (!pileDest.empty()) {
			((CardObj) pileDest.peek()).draw(g, this);
		}
		if (!bureau.isEmpty())
			bureau.draw(g, this);

	}

	
	
class MouseHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(), y = e.getY(), k;
			if (pileDep.dansPile(x, y) && !pileDep.empty()) {
				pileDest.push((CardObj) pileDep.pop());
			} else if (pileDest.dansPile(x, y) && !pileDest.empty())
				bureau.addElement((CardObj) pileDest.pop());
			else if ((k = bureau.indTabl(x, y)) >= 0) {
				pileDep.push((CardObj) (bureau.elementAt(k)));
				bureau.deleteAt(k);

			}
			repaint();
		}
	}

	public static void main(String[] arg) {
		JFrame fr = new JFrame("Solitaire");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400, 400);
		CardMover cv = new CardMover();
		fr.add(cv);
		cv.init();
		fr.setVisible(true);
	}
}