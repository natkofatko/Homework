
package GUIMay30th;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorWindow extends JFrame {
	
	private JLabel messageLable;
	private JButton button; 
private JTextField textMessage; 
private JPanel panel; 
private JButton yelloButton; 
private JButton redButton; 
private JButton blueButton; 

private final int WIDTH=350; 
private final int HAIGHT=200; 

//constructor
public ColorWindow()
{
	setTitle(" Color window");
	setSize(WIDTH, HAIGHT);
	

	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//create a message
	messageLable = new JLabel("Here click to chose a color"); 
	//JOptionPane.showMessageDialog(null, "Click a button to chose a color");
	
	redButton=new JButton("red");
	blueButton = new JButton("Blue"); 
	yelloButton = new JButton("yellow"); 

	redButton.addActionListener(new redButtonListener());
	yelloButton.addActionListener(new YellowButtonListener());
	blueButton.addActionListener(new BlueButtonListener());
	
	panel= new JPanel(); 
	panel.add(messageLable);
	panel.add(blueButton);
	panel.add(yelloButton);
	panel.add(redButton); 
	add(panel); 
	setVisible(true);
}

private class redButtonListener implements ActionListener
{

	
	public void actionPerformed(ActionEvent e) {
		panel.setBackground(Color.RED);
		messageLable.setForeground(Color.BLUE);
		
	}
	
}
private class BlueButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		panel.setBackground(Color.BLUE);
		messageLable.setForeground(Color.GREEN);
		
	}
	
}
private class YellowButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		panel.setBackground(Color.YELLOW);
		messageLable.setForeground(Color.PINK);
		
	}

	

}	
public static void main(String[] args) {
	new ColorWindow(); 
}
	

} 
