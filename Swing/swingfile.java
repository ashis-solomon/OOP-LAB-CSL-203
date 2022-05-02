import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class app extends JFrame implements ActionListener{
	JFrame frame = new JFrame("File App");
	JTextField t1;
	JPanel p1,p2,p3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6;
	
	app(){
		frame.setSize(720,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		p1 = new JPanel();
		p1.setBounds(0,0,720,180);
		//p1.setBackground(new Color(120,0,120));
		p1.setLayout(null);
		frame.add(p1);

		p2 = new JPanel();
		p2.setBounds(0,180,720,45);
		//p2.setBackground(Color.red);
		p2.setLayout(new FlowLayout());
		frame.add(p2);

		p3 = new JPanel();
		p3.setBounds(310,300,360,235);
		//p3.setBackground(Color.blue);
		p3.setLayout(new GridLayout(6,1));
		frame.add(p3);
		
		t1 = new JTextField();
		t1.setBounds(260,65,200,50);
		p1.add(t1);
		
		b1 = new JButton("Search");
		b1.addActionListener(this);
		p2.add(b1);
		b2 = new JButton("Submit");
		b2.addActionListener(this);
		p2.add(b2);
		
	
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		
		p3.add(l1);
		p3.add(l2);
		p3.add(l3);
		p3.add(l4);
		p3.add(l5);
		p3.add(l6);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			try{
				File file = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/input.txt");
				FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/input.txt");
				
				int ch=0,avg=0; char c;
				String str=""; String[] sp,line;
	
				while(ch!=-1){
					ch = reader.read();
					c = (char)ch;
					str+=c;
				}
				sp = str.split("\n");
				
				for(int i=0;i<sp.length;i++){
					line = sp[i].split(" ");
					if(Integer.parseInt(line[0]) == Integer.parseInt(t1.getText())){
						l1.setText("Name    =  " + line[1]);
						l2.setText("Roll no   =  " + line[0]);
						l3.setText("Mark 1   =  " + line[2]);
						l4.setText("Mark 2   =  " + line[3]);
						l5.setText("Mark 3   =  " + line[4]);
						avg = (Integer.parseInt(line[2]) + Integer.parseInt(line[3]) + Integer.parseInt(line[4]))/3;
						l6.setText("Average Marks  =  " + avg);
					}
				}
			
				reader.close();
			}
			catch(Exception ec){
				System.out.println(ec + "\n");
			}
			
		}
	
		if(e.getSource()==b2){
			try{
				File file = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/output.txt");
				FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/output.txt",true);
				FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/input.txt");
				boolean isFile = file.exists();
				if(!isFile){file.createNewFile();}

				
				int ch=0,avg=0; char c;
				String str=""; String[] sp,line;
	
				while(ch!=-1){
					ch = reader.read();
					c = (char)ch;
					str+=c;
				}
				sp = str.split("\n");
				
				for(int i=0;i<sp.length-1;i++){
					line = sp[i].split(" ");
					if(Integer.parseInt(line[0]) == Integer.parseInt(t1.getText())){
						avg = (Integer.parseInt(line[2]) + Integer.parseInt(line[3]) + Integer.parseInt(line[4]))/3;
						String wr = line[0] + "  " + line[1] + "  " + line[2] + "  " + line[3] + "  " + line[4] + "  " + avg + "\n";
						writer.append(wr);
					}
				}
			
				reader.close();
				writer.close();
			}
			catch(Exception ec){
				System.out.println(ec + "\n");
			}
		}
	}
}


class swingfile{
	public static void main(String[] args){
		app app1 = new app();
	}
}