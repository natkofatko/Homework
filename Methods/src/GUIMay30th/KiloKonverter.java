package GUIMay30th;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 
public class KiloKonverter extends JFrame{

	private JPanel panel;
	private JButton button; 
	private JButton button1; 
	private JTextField textField; 
	private JLabel lable; 
	private final int WIDTH =350; 
	private final int HAIGHT =200; 
	
	//constructor
	
	public KiloKonverter()
	{
		setTitle("kilometer converter");
		setSize(WIDTH, HAIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel); 
		setVisible(true);
	}
	
	private void buildPanel()
	{
		lable =new JLabel("Enter a distance in kilometers"); 
		
		textField = new JTextField(10); 
		
		button = new JButton("Calculate");
		button1 = new JButton("hello"); 
		
		CalcButtonListener cc = new CalcButtonListener(); 
		button.addActionListener(cc);
		
		panel = new JPanel(); 
		panel.add(lable); 
		panel.add(textField); 
		panel.add(button);
		panel.add(button1);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.PINK);
		
	}
	private class CalcButtonListener implements ActionListener
	{
		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
				final double conversion =0.614; 
				String input; 
				double miles; 
			input = textField.getText(); 
			
			miles = Double.parseDouble(input) *conversion;
			if (miles==0)
			System.out.println("no text");
			else
			JOptionPane.showMessageDialog(null, input + "the result after converting is " + miles);
			
			
		}
	}
		
	
	
	public static void main(String[] args) {
		
		new KiloKonverter(); 
		
	}
	
	
	
}
