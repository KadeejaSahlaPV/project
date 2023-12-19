import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	public Calculator() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(500,150);
		
		JLabel displayLabel=new JLabel("Hello Sahla");
		displayLabel.setBounds(30, 50, 500, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(170,130,80,80);
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(310,130,80,80);
		jf.add(nineButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(170,230,80,80);
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(310,230,80,80);
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(30,330,80,80);
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(170,330,80,80);
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(310,330,80,80);
		jf.add(threeButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(170,430,80,80);
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(310,430,80,80);
		jf.add(equalButton);
		
	
		JButton divButton=new JButton("/");
		divButton.setBounds(450,130,80,80);
		jf.add(divButton);
		
		JButton mulButton=new JButton("*");
		mulButton.setBounds(450,230,80,80);
		jf.add(mulButton);
		
		JButton minButton=new JButton("-");
		minButton.setBounds(450,330,80,80);
		jf.add(minButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(450,430,80,80);
		jf.add(addButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
