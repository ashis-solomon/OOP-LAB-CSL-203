import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class app extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Button Trial");
	JPanel p1,p2;
	JButton b1,b2;
	
	app(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(720,720);
		frame.setLayout(null);

		p1 = new JPanel();
		p1.setBounds(0,0,360,360);
		frame.add(p1);

		p2 = new JPanel();
		p2.setBounds(360,0,360,360);
		frame.add(p2);
	
		b1 = new JButton("Hello");
		b1.addActionListener(this);
		b1.setFocusable(false);
		p1.add(b1);

		b2 = new JButton("Hello2");
		b2.addActionListener(e -> b2.setText("Hii"));
		p2.add(b2);
		
		

	}	
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			b1.setText("Clicked");
			b1.setEnabled(false);
		}
	}

}


class buttontrial{
	public static void main(String[] args){
		app app1 = new app();
	}
}