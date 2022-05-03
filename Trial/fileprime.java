import java.io.*;
import java.util.*;


class thread1 extends Thread{
	public void run(){
		try{
			FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Trial/f1.txt");
			FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Trial/f2.txt");
			int c=0;
			char ch='a';
			String str = "";
			while(c!=-1){
				c = reader.read();
				ch = (char)c; 
				if(c==-1){break;}
				str += ch;
			}
			String[] sp = str.split(" ");
			int flag = 0,num;
			for(int i=0;i<sp.length;i++){
				flag = 0; 
				num = Integer.parseInt(sp[i]);
				for(int j=2;j<=num/2;j++){
					if(num==1){flag = 1;}
					if(num%j==0){flag = 1;}
				}
				if(num==1){flag=1;}
				if(flag==0){
					writer.append(num+" ");
				}
			}
			reader.close();
			writer.close();
		}catch(Exception e){
			System.out.println(e+"\n");
		}
	}

}

class thread2 extends Thread{
	public void run(){
		try{
			FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Trial/f1.txt");
			FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/Trial/f3.txt");
			int c=0;
			char ch='a';
			String str = "";
			while(c!=-1){
				c = reader.read();
				ch = (char)c; 
				if(c==-1){break;}
				str += ch; 
			}
			String[] sp = str.split(" ");
			int flag = 0,num;
			for(int i=0;i<sp.length;i++){
				flag = 0; 
				num = Integer.parseInt(sp[i]);
				for(int j=2;j<=num/2;j++){
					if(num==1){flag = 1;}
					if(num%j==0){flag = 1;}
				}
				if(num==1){flag=1;}
				if(flag==1){
					writer.append(num+" ");
				}
			}
			reader.close();
			writer.close();
		}catch(Exception e){
			System.out.println(e+"\n");
		}	
	}
	
	

}

class fileprime{
	public static void main(String[] args){
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();

		t1.start();
		t2.start();
	}
}




