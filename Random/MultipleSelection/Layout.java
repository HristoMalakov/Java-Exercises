import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Layout extends JFrame{
	
	private JButton a,b,c;
	private FlowLayout layout;
	private Container container;
	
	public Layout(){
		
		super("The title");
		layout = new FlowLayout();
		
		setLayout(layout);
		container = getContentPane();
		
		a = new JButton("Left");
		add(a);
		a.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
				}
			}
		);
		
		b = new JButton("Center");
		add(b);
		b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					layout.setAlignment(FlowLayout.CENTER);
					layout.layoutContainer(container);
				}
			}
		);
		
		c = new JButton("Right");
		add(c);
		c.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
				}
			}
		);	
	}
}
