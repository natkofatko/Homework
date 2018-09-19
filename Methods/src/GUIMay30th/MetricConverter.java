package GUIMay30th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MetricConverter extends JFrame{

	private JTextField textMessage; 
	private JLabel lable; 
	private JButton inches; 
	private JButton kilom; 
	private JButton miles;
	private JPanel panel; 
	private ButtonGroup group; 
	
	private final int Weig =400;
	private final int HEI = 100; 
	
	public MetricConverter()
	{
		setTitle("Metric converter");
		//'setSize(Weig, HEI);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel(); 
		
		add(panel); 
		pack(); 
		setVisible(true);
	}
	private void buildPanel()
	{
		textMessage = new JTextField(10); 
		lable = new JLabel("enter a distance in kilometers"); 
		inches = new JButton("kilom to inches"); 
		miles = new JButton("kilom to miles"); 
		kilom = new JButton("km to km"); 
		
		//group the radio butoons
		group = new ButtonGroup(); 
		group.add(inches);
		group.add(kilom);
		group.add(miles);
		
	miles.addActionListener(new RadioButtonListener());
	kilom.addActionListener(new RadioButtonListener());
	inches.addActionListener(new RadioButtonListener());
		//create a panel and add components to it
		panel = new JPanel(); 
		panel.add(textMessage); 
		panel.add(lable); 
		panel.add(inches); 
		panel.add(kilom); 
		panel.add(miles);
		
	}
	private class RadioButtonListener implements ActionListener {

		String input; 
		String convertTo = ""; 
		double result = 0.0; 
		
		
		public void actionPerformed(ActionEvent e) {
		 input =textMessage.getText(); 
		 
		 if(e.getSource().equals(miles))
			 {convertTo= "miles "; 
			 result = Double.parseDouble(input) *0.6214;
			 }
		 else if(e.getSource().equals(kilom))
		 {
			 convertTo=" feet";
			 result = Double.parseDouble(input)* 3281.0; 
		 }
		 else if(e.getSource().equals(inches))
		 {
			 convertTo="inches"; 
			 result =Double.parseDouble(input)*39370.0;
		 }
		 JOptionPane.showMessageDialog(null, input + "kilometers is " + result + convertTo);
		}
		
	}
	public static void main(String[] args) {
		new MetricConverter(); 
	}
	
}
