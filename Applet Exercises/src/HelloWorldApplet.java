import java.awt.*;
import javax.swing.*;

public class HelloWorldApplet extends JApplet{
     
	public void start(){
		
	}
    public void init(){
		setBackground(Color.YELLOW);
		setForeground(Color.GREEN);
	}
    
    public void paint(Graphics g){
		g.drawString("Hello World", 100, 100);
		g.drawString("My name is Hristo", 100, 115);
		g.drawString("This should also appear", 100, 130);
	}
    public void stop(){
		
	}
	
}
