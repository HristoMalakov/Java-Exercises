import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ImageModel extends Applet {

	Image n;
	Button ply, stp;
	AudioClip chimes, chord;

	Scrollbar scrollbar, scrollbarV;
	int valueX = 50, valueY = 50;

	public void init() {
		n = getImage(getCodeBase(), "C1.png");

		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		chimes = getAudioClip(getCodeBase(), "chimes.wav");
		chord = getAudioClip(getCodeBase(), "chord.wav");

		ply = new Button("Play");
		stp = new Button("Stop");

		ply.addActionListener(new SpPlay());
		add("West", ply);

		stp.addActionListener(new SpStop());
		add("South", stp);

		scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 20, 1, 100);

		// parametres: orientation, initValue, sizeBubble, minVal,maxVal

		scrollbarV = new Scrollbar(Scrollbar.VERTICAL, 50, 10, 1, 100);

		scrollbar.addAdjustmentListener(new SB());
		add("North", scrollbar);

		scrollbarV.addAdjustmentListener(new SBV());
		add("East", scrollbarV);

	}

	class SB implements AdjustmentListener {

		public void adjustmentValueChanged(AdjustmentEvent e) {

			valueX = scrollbar.getValue();
			chimes.play();
			repaint();
		}
	}

	class SBV implements AdjustmentListener {

		public void adjustmentValueChanged(AdjustmentEvent e) {

			valueY = scrollbarV.getValue();
			chimes.play();
			repaint();
		}
	}

	class SpPlay implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			chord.loop();
		}
	}

	class SpStop implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			chord.stop();
		}
	}

	public void paint(Graphics g) {

		g.drawImage(n, valueX, valueY, 200, 200, this);

	}
}
