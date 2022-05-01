import javax.swing.*;
import java.awt.*;


class app extends JFrame{
	JFrame frame;
	JLabel l1,l2,l3;
	app(){		

		frame = new JFrame();
		frame.setTitle("Basic2");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hide exit do_nothing
		frame.setResizable(true);
		frame.setSize(640,640);
		frame.setLayout(null);
		
		//frame.getContentPane().setBackground(Color.red); // cyan red blue green gray darkGray black
		//frame.getContentPane().setBackground(new Color(0,120,240));
		//frame.getContentPane().setBackground(new Color(0x123456));

		ImageIcon image = new ImageIcon("img.png");
		frame.setIconImage(image.getImage());
		
		l1 = new JLabel();
		l1.setText("LABEL 1");
		l1.setBounds(0,0,320,320);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(l1);

		l2 = new JLabel("LABEL 2");
		l2.setBounds(320,0,320,320);
		l2.setVerticalAlignment(JLabel.CENTER);
		l2.setForeground(new Color(240,0,120));
		l2.setHorizontalAlignment(JLabel.CENTER);
		frame.add(l2);

		l3 = new JLabel("LABEL 3");
		l3.setBounds(0,320,320,320);
		l3.setVerticalAlignment(JLabel.CENTER);
		l3.setHorizontalAlignment(JLabel.CENTER);
		frame.add(l3);
	}
}

class basic2{
	public static void main(String[] args){
		app app1 = new app();
	}
}