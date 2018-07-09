import java.awt.*;
import javax.swing.* ;

public class ButtonChecker1 extends JFrame{
	
    public static void main (String[] arg){
    	
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Panel p = new Panel();
        Button b1 = new Button("bt 1");     
        Checkbox cb = new Checkbox("check please",false);
        
        p.add(b1);
        p.add(cb);
        f.add(p);
        
        f.setSize(300, 220);
        f.setVisible(true);
     
    }
}