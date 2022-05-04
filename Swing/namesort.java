import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class quick{
	static int partition(String[] arr,int low,int high){
		String pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j].compareTo(pivot) <= 0){
				i++;
				String temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		String temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

	static void quicksort(String[] arr,int low,int high){
		if(low<high){
			int p = partition(arr,low,high);
			quicksort(arr,low,p-1);
			quicksort(arr,p+1,high);
		}
	}
}


class app implements ActionListener{
	JFrame frame = new JFrame("App");
	JLabel l1,l2;
	JTextField t1;
	JPanel p1,p2;
	JButton b1,b2;

	app(){
		frame.setSize(720,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		l1 = new JLabel("Enter the Strings [separated by spaces]  : ");
		l1.setBounds(60,30,300,100);
		frame.add(l1);		
	
		t1 = new JTextField();
		t1.setBounds(340,60,340,50);
		frame.add(t1);

		p1 = new JPanel();
		p1.setBounds(0,170,720,100);
		p1.setLayout(new FlowLayout());
		//p1.setBackground(new Color(240,0,240));
		frame.add(p1);

		b1 = new JButton("Sort");
		b1.addActionListener(this);
		p1.add(b1);
			
		b2 = new JButton("Save");
		b2.addActionListener(this);
		p1.add(b2);

		p2 = new JPanel();
		p2.setBounds(0,300,720,300);
		p2.setLayout(new FlowLayout());
		//p2.setBackground(new Color(0,240,240));
		frame.add(p2);

		l2 = new JLabel("Hi!!");
		p2.add(l2);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){		
			String str = t1.getText();
			String[] sp = str.split(" ");
			quick.quicksort(sp,0,sp.length-1);
			str = "";
			for(int i=0;i<sp.length;i++){
				str = str + sp[i] + "  ";
			}
			str = "Sorted List :   " + str;
			l2.setText(str);
		}
		if(e.getSource() == b2){
			String str = t1.getText();
			String[] sp = str.split(" ");
			quick.quicksort(sp,0,sp.length-1);
			str = "";
			for(int i=0;i<sp.length;i++){
				str = str + sp[i] + "  ";
			}
			str = "Sorted List :   " + str;
			l2.setText(str);
			try{
				FileWriter writer = new FileWriter("sorted_names.txt");
				writer.write(str);
				writer.close();
				l2.setText("Saved!");
			}catch(Exception ex){
				System.out.println(ex + "\n");
			}
			
		}
	}
}


class namesort{
	public static void main(String[] args){
		app app1 = new app();
	}
}