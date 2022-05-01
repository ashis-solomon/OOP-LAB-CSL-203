import javax.swing.*;
import java.awt.*;


class app extends flow{
	JFrame frame = new JFrame("Flow");
	JButton b1,b2,b3,b4,b5,b6,b7;	

	app(){
		frame.setSize(720,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");		
		b7 = new JButton("7");		

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);		
		frame.add(b7);

		frame.setVisible(true);
		
	}
}


class flow{
	public static void main(String[] args){
		app app1 = new app();
	}
}