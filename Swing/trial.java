import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class app extends JFrame implements ActionListener{
	JFrame frame = new JFrame("TRIAL");
	JPanel p1;
	JButton b1,b2;
	
	app(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(720,720);
		frame.getContentPane().setBackground(new Color(0x123456));
		frame.setLayout(null);

		p1 = new JPanel();
		p1.setBounds(0,0,360,360);
		p1.setBackground(new Color(240,42,120));
		p1.setLayout(null);
		frame.add(p1);

		b1 = new JButton("Hi!!");
		b1.addActionListener(this);
		b1.setBounds(125,130,100,50);
		p1.add(b1);

		b2 = new JButton("Helloo!");
		b2.addActionListener(this);
		b2.setBounds(485,490,100,50);
		frame.add(b2);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			b1.setEnabled(false);
			b1.setText("Clicked");
		}
		if(e.getSource()==b2){
			System.out.println("clear");
		}
	}

}


class trial{
	public static void main(String[] args){
		app app1 = new app();
	}
}