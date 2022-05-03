import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class app extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Employee");
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JPanel p1,p2;
	
	app(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);

		l1 = new JLabel("Emp. No :");
		l1.setBounds(190,0,160,120);
		frame.add(l1);

		l2 = new JLabel("Name :");
		l2.setBounds(190,120,160,120);
		frame.add(l2);

		l3 = new JLabel("Date of Birth [dd/mm/yy] :");
		l3.setBounds(140,240,160,120);
		frame.add(l3);

		t1 = new JTextField();
		t1.setBounds(340,40,300,50);
		frame.add(t1);

		t2 = new JTextField();
		t2.setBounds(340,160,300,50);
		frame.add(t2);

		t3 = new JTextField();
		t3.setBounds(340,280,300,50);
		frame.add(t3);


		p1 = new JPanel();
		p1.setBounds(0,360,720,150);
		p1.setLayout(new FlowLayout());
		frame.add(p1);

		b1 = new JButton("Calculate");
		b1.addActionListener(this);
		b1.setBounds(0,0,100,50);
		p1.add(b1);

		b2 = new JButton("Save");
		b2.addActionListener(this);
		b2.setBounds(0,0,100,50);
		p1.add(b2);

		p2 = new JPanel();
		p2.setBounds(0,560,720,150);
		p2.setLayout(new FlowLayout());
		frame.add(p2);

		
		l4 = new JLabel();
		l4.setBounds(0,0,200,200);
		p2.add(l4);	

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			String empno,name,date;
			empno = t1.getText();
			name = t2.getText();
			date = t3.getText();
			String[] dob = date.split("/");
			int age = 2022 - Integer.parseInt(dob[2]);
			String tex = "Emp no : " + empno + "   " + "Name : " + name + "   " + "DOB : " + date + "   " + "Age : " + age + "   " ;
			l4.setText(tex);
		}

		if(e.getSource() == b2){
			String empno,name,date;
			empno = t1.getText();
			name = t2.getText();
			date = t3.getText();
			String[] dob = date.split("/");
			int age = 2022 - Integer.parseInt(dob[2]);
			
			try{
				File file = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/employee.txt");
				boolean isFile = file.exists();
				if(!isFile){
					file.createNewFile();
				}
				FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Swing/employee.txt",true);
				writer.append(empno + " " + name + " " + date +"\n");
				writer.close();

				l4.setText("Saved!!!");
			}catch(Exception ee){
				System.out.println(ee + "\n");
			}
			
			
		}
	}
}


class employee{
	public static void main(String[] args){
		app app1 = new app();
	}
}