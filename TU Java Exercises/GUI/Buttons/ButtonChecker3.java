import java.awt.*;
import javax.swing.* ;

public class ButtonChecker3 {
	
    public static void main (String[] arg){
    	
        JFrame f = new JFrame("Frame 1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        Panel p = new Panel();
        
        Button b1 = new Button("bt 1");
        Checkbox cb = new Checkbox("check please",true);
        
        p.add(b1);
        p.add(cb);
        f.add(p);
        
        Panel p2 = new Panel();
        
        for(int i=0;i<5;i++){
            p2.add(new Button("Button heh"+i));
        }
        f.add(p2); 

        f.setSize(450, 250);
        f.setVisible(true);
    }
}