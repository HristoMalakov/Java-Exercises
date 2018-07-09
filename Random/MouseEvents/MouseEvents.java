import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class MouseEvents extends JFrame{
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public MouseEvents(){
		
		super("Title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		
		Handlerclass handler = new Handlerclass();
		
		mousepanel.addMouseListener( handler);
		mousepanel.addMouseMotionListener(handler);
		add(mousepanel,BorderLayout.CENTER);
		
		
		
		statusbar = new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
	}

	private class Handlerclass implements MouseListener,MouseMotionListener{
		
		public void mouseClicked(MouseEvent e){
			statusbar.setText(String.format("You clicked at %d:%d",e.getX(),e.getY()));
			mousepanel.setBackground(Color.RED);
		}
		public void mousePressed(MouseEvent e){
			statusbar.setText(String.format("You pressed at %d:%d",e.getX(),e.getY()));
			mousepanel.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e){
			statusbar.setText(String.format("You released at %d:%d",e.getX(),e.getY()));
			mousepanel.setBackground(Color.WHITE);
		}
		public void mouseEntered(MouseEvent e){
			statusbar.setText(String.format("You entered the mouse at %d:%d",e.getX(),e.getY()));
		}
		public void mouseExited(MouseEvent e){
			statusbar.setText(String.format("You exited at %d:%d",e.getX(),e.getY()));
		}
		public void mouseMoved(MouseEvent e){
			statusbar.setText(String.format("You are moving the mouse at %d:%d",e.getX(),e.getY()));
		}
		public void mouseDragged(MouseEvent e){
			statusbar.setText(String.format("You are dragging the mouse at %d:%d",e.getX(),e.getY()));
		}
		
	}

}
