import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MultipleSelector extends JFrame{

	private JButton movebutton;
	private JList leftlist;
	private JList rightlist;
	private String[] foods = {"bacon","ham","beef","musli","lasagnia"};
	
	public MultipleSelector(){
		
		super("Title");
		setLayout(new Layout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move to right");
		movebutton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					rightlist.setListData(leftlist.getSelectedValues());
//Deprecated means that you're not supposed to use it anymore, as it's 
//been replaced by something better and may be removed in the future.
				}
			}
		);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		
		
	}
	
}
