import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class app extends JFrame{
	JFrame frame = new JFrame("Border Layout");
	JPanel p1,p2,p3,p4,p5;
	
	app(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
	
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.yellow);
		p4.setBackground(Color.magenta);
		p5.setBackground(Color.blue);
		
		p1.setPreferredSize(new Dimension(50,50));
		p2.setPreferredSize(new Dimension(50,50));
		p3.setPreferredSize(new Dimension(50,50));
		p4.setPreferredSize(new Dimension(50,50));
		p5.setPreferredSize(new Dimension(50,50));
		
		frame.add(p1,BorderLayout.NORTH);
		frame.add(p2,BorderLayout.SOUTH);
		frame.add(p3,BorderLayout.WEST);
		frame.add(p4,BorderLayout.EAST);
		frame.add(p5,BorderLayout.CENTER);
	}
}


class border{
	public static void main(String[] args){
		app app1 = new app();
	}
}