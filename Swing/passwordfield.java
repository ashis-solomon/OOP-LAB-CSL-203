import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class app extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Text Field");
	JPasswordField p1;
	JButton b1;
	JLabel l1;
	
	app(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);

		p1 = new JPasswordField();
		p1.setBounds(120,200,500,50);
		frame.add(p1);
		
		b1 = new JButton("Submit");
		b1.setBounds(320,360,100,50);
		b1.addActionListener(this);
		frame.add(b1);

		l1 = new JLabel();
		l1.setBounds(120,20,500,100);
		frame.add(l1);
		

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String str = p1.getText();
			
			b1.setText("Clicked");
			b1.setEnabled(false);
			
			l1.setText("Password = " + str);
		}
	}
}


class passwordfield{
	public static void main(String[] args){
		app app1 = new app();
	}
}