import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class bubble{
	public static void bubsort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

class thread1 extends Thread{
	int num;
	thread1(int num){
		this.num = num;
	}
	public void run(){
		try{
			FileWriter writer = new FileWriter("odd.txt",true);
			String str = num + " ";
			writer.append(str);
			writer.close();
		}catch(Exception e){System.out.println(e+"\n");}
	}
}

class thread2 extends Thread{
	int num;
	thread2(int num){
		this.num = num;
	}
	public void run(){
		try{
			FileWriter writer = new FileWriter("even.txt",true);
			String str = num + " ";
			writer.append(str);
			writer.close();
		}catch(Exception e){System.out.println(e+"\n");}
		
	}
}

class thread0 extends Thread{
	int[] arr;
	thread0(int[] arr){
		this.arr = arr;
	}
	public void run(){
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 != 0){
				thread1 t1 = new thread1(arr[i]);
				t1.start();
			}
			else{
				thread2 t2 = new thread2(arr[i]);
				t2.start();
			}
		}
	}
}


class app implements ActionListener{
	JFrame frame = new JFrame("App");
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	JPanel p1,p2;
	
	app(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);
	
		l1 = new JLabel("Enter the Numbers [Separated by spaces] : ");
		l1.setBounds(20,0,360,180);
		frame.add(l1);

		t1 = new JTextField();
		t1.setBounds(330,70,350,40);
		frame.add(t1);
	
		p1 = new JPanel();
		p1.setBounds(0,180,720,70);
		//p1.setBackground(Color.red);
		p1.setLayout(new FlowLayout());
		frame.add(p1);
		
		b1 = new JButton("Sort");
		b1.addActionListener(this);
		p1.add(b1);

		b2 = new JButton("Split Odd-Even File");
		b2.addActionListener(this);
		p1.add(b2);

		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		//p2.setBackground(new Color(0x123456));
		p2.setBounds(0,400,720,360);
		frame.add(p2);

		l2 = new JLabel();
		p2.add(l2);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			String str = t1.getText();
			String[] sp = str.split(" ");
			int[] arr = new int[sp.length];
			for(int i=0;i<sp.length;i++){
				arr[i] = Integer.parseInt(sp[i]);
			}
			//bubble b = new bubble();
			bubble.bubsort(arr);
			String op = "";
			for(int i=0;i<arr.length;i++){
				op = op + arr[i] + "  ";
			}
			l2.setText("Array [Bubble Sort] : " + op);
		}
		if(e.getSource()==b2){
			String str = t1.getText();
			String[] sp = str.split(" ");
			int[] arr = new int[sp.length];
			for(int i=0;i<sp.length;i++){
				arr[i] = Integer.parseInt(sp[i]);
			}
			thread0 t0 = new thread0(arr);
			t0.start();
			l2.setText("Saved!");
		}
	}
}


class swingmulfisort{
	public static void main(String[] args){
		app app1 = new app();
	}
}