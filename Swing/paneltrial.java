import javax.swing.*;
import java.awt.*;

class app{
	JFrame frame = new JFrame("Panel Trial");
	JPanel p1,p2,p3;
	JLabel l1;
	
	app(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(720,720);
		frame.setLayout(null);

		p1 = new JPanel();
		p1.setBounds(0,0,360,360);
		p1.setBackground(Color.red);
		frame.add(p1);

		p2 = new JPanel();
		p2.setBounds(360,0,360,360);
		p2.setBackground(Color.blue);
		frame.add(p2);
		
		p3 = new JPanel();
		p3.setBounds(0,360,720,360);
		p3.setBackground(Color.green);
		p3.setLayout(null);
		frame.add(p3);

		l1 = new JLabel("Hi!!!");
		l1.setBounds(0,0,720,360);
		l1.setVerticalAlignment(JLabel.TOP);
		p3.add(l1);

		
	}

}


class paneltrial{
	public static void main(String[] args){
		app app1 = new app();
	}
}