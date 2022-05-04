import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class app1 implements ActionListener{
	JFrame frame = new JFrame("MAIN APP");
	JPanel p1;
	JButton b1,b2;
	
	app1(){
		frame.setSize(720,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		p1 = new JPanel();
		p1.setBounds(180,300,360,360);
		//p1.setBackground(Color.red);
		p1.setLayout(new FlowLayout());
		frame.add(p1);

		b1 = new JButton("Register Panchayat");
		b1.addActionListener(this);
		p1.add(b1);

	
		b2 = new JButton("Register Voter");
		b2.addActionListener(this);
		p1.add(b2);

		frame.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			new app2();
			//b1.setEnabled(false);
		}
		if(e.getSource() == b2){
			new app3();
			//b2.setEnabled(false);
		}
	}
}

class app2 implements ActionListener{
	JFrame frame = new JFrame();
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1;

	app2(){
		frame.setSize(640,640);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		l1 = new JLabel("Enter Name of Panchayat : ");
		l1.setBounds(100,50,250,50);
		frame.add(l1);

	
		l2 = new JLabel("Enter Name of District : ");
		l2.setBounds(100,150,250,50);
		frame.add(l2);

		l3 = new JLabel("Enter the Population : ");
		l3.setBounds(105,250,250,50);
		frame.add(l3);	

		t1 = new JTextField();
		t1.setBounds(360,50,250,50);
		frame.add(t1);

		t2 = new JTextField();
		t2.setBounds(360,150,250,50);
		frame.add(t2);

		t3 = new JTextField();
		t3.setBounds(360,250,250,50);
		frame.add(t3);
		
		b1 = new JButton("Submit");
		b1.addActionListener(this);
		b1.setBounds(240,340,150,50);
		frame.add(b1);

		l4 = new JLabel("-");
		l4.setBounds(250,400,200,200);
		frame.add(l4);

		frame.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
		try{
			String name = t1.getText();
			String district = t2.getText();
			String population = t3.getText();
			
			File file = new File("panchayat.txt");
			boolean isFile = file.exists();
			if(!isFile){
				file.createNewFile();
			}
			File file2 = new File("panchayat_name.txt");
			boolean isFile2 = file2.exists();
			if(!isFile2){
				file2.createNewFile();
			}
			FileReader reader = new FileReader("panchayat_name.txt");
			FileWriter writer = new FileWriter("panchayat_name.txt",true);
			FileWriter writer2 = new FileWriter("panchayat.txt",true);
	
			int c=0; char ch;
			String str = "";
			while(c!=-1){
				c = reader.read();
				ch = (char)c;
				str = str + ch;
			}
			
			if(str.contains(name)){
				l4.setText("Panchayat Already Registered!!");
			}
			else{
				l4.setText("Panchayat Registered!!");
				writer.append(name + " ");
				writer2.append(name + " " + district + " " + population + "\n");
			}
			
			
			writer.close();
			writer2.close();	
			reader.close();
			
		}catch(Exception ex){System.out.println(ex + "\n");}
		}
	}
}


class app3 implements ActionListener{
	JFrame frame = new JFrame();
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;

	app3(){
		frame.setSize(640,640);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		l1 = new JLabel("Enter Name  : ");
		l1.setBounds(100,20,250,50);
		frame.add(l1);

	
		l2 = new JLabel("Male/Female [M/F] : ");
		l2.setBounds(100,100,250,50);
		frame.add(l2);

		l3 = new JLabel("Enter your Age : ");
		l3.setBounds(105,200,250,50);
		frame.add(l3);	

		l4 = new JLabel("Enter your Voters ID : ");
		l4.setBounds(105,300,250,50);
		frame.add(l4);	

		l5 = new JLabel("Enter your Panchayat Name : ");
		l5.setBounds(105,400,250,50);
		frame.add(l5);	



		t1 = new JTextField();
		t1.setBounds(360,20,250,50);
		frame.add(t1);

		t2 = new JTextField();
		t2.setBounds(360,100,250,50);
		frame.add(t2);

		t3 = new JTextField();
		t3.setBounds(360,200,250,50);
		frame.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(360,300,250,50);
		frame.add(t4);

		t5 = new JTextField();
		t5.setBounds(360,400,250,50);
		frame.add(t5);


		b1 = new JButton("Submit");
		b1.addActionListener(this);
		b1.setBounds(240,480,150,50);
		frame.add(b1);


		frame.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			//new dialog();
			new radioBut();
		}
	}
}

class dialog{
	JFrame frame = new JFrame("Error");
	JLabel l1;
	String msg;
	dialog(String msg){
		this.msg = msg;

		frame.setSize(400,200);
		frame.setLayout(null);
			
		l1 = new JLabel(msg);
		l1.setBounds(100,50,100,50);
		frame.add(l1);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class radioBut implements ActionListener{
	JFrame frame = new JFrame("Radio");
	JRadioButton r1,r2;
	JButton b1;
	ButtonGroup G;

	radioBut(){
		frame.setSize(600,600);
		frame.setLayout(new FlowLayout());

		r1 = new JRadioButton();
		frame.add(r1);
		r2 = new JRadioButton();
		frame.add(r2);

		r1.setText("Male");
		r2.setText("Female");
	
		b1 = new JButton("Submit");
		b1.addActionListener(this);
		frame.add(b1);
		
		G = new ButtonGroup();
		G.add(r1);
		G.add(r2);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			if(r1.isSelected()){
				new dialog("MALE!");
			}
			if(r2.isSelected()){
				new dialog("FEMALE!");
			}
		}
	}
}

class project2{
	public static void main(String[] args){
		new app1();
	}
}