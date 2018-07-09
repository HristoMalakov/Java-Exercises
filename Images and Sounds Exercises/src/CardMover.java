import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class CardEx extends Applet {

	Image Card[] = new Image[5];
	Button ply, stp;
	AudioClip chimes, chord;

	int wh = 70, ht = 100;
	int vX[] = new int[Card.length];
	int vY[] = new int[Card.length];

	boolean back[] = new boolean[Card.length];
	boolean ctch[] = new boolean[Card.length];
	int helpX, helpY, clicks;

	public void init() {

		setBackground(Color.green);

		for (int i = 0; i < Card.length; i++) {
			
			Card[i] = getImage(getCodeBase(), "C" + i + ".png");
			vX[i] = 20 + 50 * i;
			vY[i] = 30;
			back[i] = ctch[i] = false;//zashto e false?
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
//proverqva dali x,y sa v kartata i = chckIn
					ctch[i] = true;
					if (e.getClickCount() == 2) {

						if (back[i])
							Card[i] = getImage(getCodeBase(), "C" + i + ".png");

						else
							Card[i] = getImage(getCodeBase(), "Cback.png");
						    back[i] = !back[i];//?
						    repaint(vX[i], vY[i], wh, ht);//?
					}
				}
			}
			clicks = e.getClickCount();
			repaint();
		}

		public void mouseReleased(MouseEvent e) {

			for (int i = 0; i < Card.length; i++)

				ctch[i] = false;//?
			repaint();
		}
	}

	class MouseMotionHandler extends MouseMotionAdapter {

		public void mouseDragged(MouseEvent e) {

			int x = e.getX();
			int y = e.getY();

			for (int i = 0; i < Card.length; i++)
				if (ctch[i]) {/*ctch= ?*/
					vX[i] += (x - helpX);/*(1),vX e nachalniq x, 
vurhu koito se postavq kartata pri start na programata
nachalen x += ?-?*/
					vY[i] += (y - helpY);
					repaint(vX[i], vY[i], wh, ht);//repaintva
//mqstoto ostaveno sled kartata s izobr na kartata
					helpX = x;
					helpY = y;/*(1)zastoporqvat kartata na edno mqsto
vednuj sled kato si q kliknal i si i zadal posoka da se mesti
x, y = posoka; helpx,, = koordinati, kadeto mesteneto v x posoka 
da spre*/
				}
		}
	}

	public void paint(Graphics g) {//class component abstract method

		for (int i = 0; i < Card.length; i++) {

			g.drawImage(Card[i], vX[i], vY[i], wh, ht, this);
			//Taka se izrisuvat kartite oshte v nachaloto
			g.drawRect(vX[i], vY[i], wh, ht);
			//Taka se izrisuvat ramkite na kartite

		}
	}

	boolean chckIn(int ncard, int x, int y) {

		if ((x > vX[ncard]) && (x < vX[ncard] + wh) && (y > vY[ncard]) && (y < vY[ncard] + ht))
			return true;

		return false;
	}
}
