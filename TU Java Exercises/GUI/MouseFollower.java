import javax.swing.*;
import java.awt.event.*;

public class MouseFollower extends JFrame{
    
	public MouseFollower(int x, int y, int length, int height){
		setBounds(x,y,length,height);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener( new MyMouse());		
	}
	
	public class MyMouse implements MouseListener{
		
		public void mouseClicked(MouseEvent event){
			System.out.println("X: "+getX()+" Y: "+getY());
		}
		public void mouseEntered(MouseEvent event){
			System.out.println("Mouse in");
		}
		public void mouseExited(MouseEvent event){
			System.out.println("Mouse out");
		}
		public void mousePressed(MouseEvent event){
		
		}
		public void mouseReleased(MouseEvent event){
			
		}
		
		
	}
	
	
	
}
