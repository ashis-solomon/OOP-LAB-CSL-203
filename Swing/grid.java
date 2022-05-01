import javax.swing.*;
import java.awt.*;


class app extends flow{
	JFrame frame = new JFrame("Flow");
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JButton op1,op2,op3,op4;
	JPanel p1,p2,p3;	

	app(){
		frame.setSize(720,720);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");		
		b7 = new JButton("7");
		b8 = new JButton("8");		
		b9 = new JButton("9");	
		b10 = new JButton();
		b11 = new JButton();		
		b12 = new JButton();	
		
		op1 = new JButton("+");
		op2 = new JButton("-");
		op3 = new JButton("*");
		op4 = new JButton("/");
		
		b10.setEnabled(false);	
		b11.setEnabled(false);
		b12.setEnabled(false);
		
		p1 = new JPanel();
		p1.setBounds(180,240,360,360);
		p1.setLayout(new GridLayout(4,4));
		frame.add(p1);

		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(op1);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(op2);		
		p1.add(b7);
		p1.add(b8);		
		p1.add(b9);
		p1.add(op3);
		p1.add(b10);
		p1.add(b11);		
		p1.add(b12);
		p1.add(op4);

		

		
		
	}
}


class grid{
	public static void main(String[] args){
		app app1 = new app();
	}
}