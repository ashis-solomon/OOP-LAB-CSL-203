import java.io.*;
import java.util.*;


class fileread{
	public static void main(String[] args){
		try{
			File file = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt");
			boolean isFile = file.exists();
			System.out.println(isFile);
			if(!isFile){file.createNewFile();}
			System.out.println("\n" + file.getPath() + "\n");
			
			FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt",true);
			//writer.append("Opened");
			//writer.append("Closed\n");
			writer.close();
						
			int ch;
			FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt");
			ch = reader.read();
			String str="";
			while(ch!=-1){
				str += (char)ch;
				ch = reader.read();
			}
			reader.close();
			System.out.println(str);
			String[] temp;
			int sum=0;
			String[] sp = str.split("\n");
			System.out.println("Number of lines = " + sp.length);
			for(int i=0;i<sp.length;i++){
				temp = sp[i].split(" ");
				sum += Integer.parseInt(temp[0]);
			}
			System.out.println("Sum = " + sum);
		}
		catch(Exception e){
			System.out.println(e+"\n");
		}
	}
}
