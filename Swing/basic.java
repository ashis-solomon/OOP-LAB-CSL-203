import javax.swing.*;
import java.awt.*;

class basic{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setTitle("Basic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit do_nothing hide
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setResizable(true);
		
		ImageIcon image = new ImageIcon("img.png");
		frame.setIconImage(image.getImage());

		frame.getContentPane().setBackground(Color.blue); // black gray darkGray blue cyan green red
		frame.getContentPane().setBackground(new Color(124,42,250));
		frame.getContentPane().setBackground(new Color(0x123456));
	}
}