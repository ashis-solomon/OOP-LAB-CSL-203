import javax.swing.*;
import java.awt.*;

class app{
	JFrame frame = new JFrame();
	JLabel l1;
	app(){
		frame.setTitle("LABEL TRIAL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(720,720);
		frame.setLayout(null);

		frame.getContentPane().setBackground(new Color(120,0,240));

		ImageIcon image = new ImageIcon("img.png");
		frame.setIconImage(image.getImage());

		l1 = new JLabel("LABEL 1");
		l1.setBounds(0,0,720,720);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.CENTER);
		l1.setForeground(Color.white);
		frame.add(l1);
	}
}


class labeltrial{
	public static void main(String[] args){
		app app1 = new app();
	}
}