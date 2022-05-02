import java.io.*;
import java.util.*;

class fileex1{
	public static void main(String[] args){
		try{
			File file = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt");
			boolean isFile = file.exists();
			if(isFile){
				System.out.println("The File Exists" + "\n");
			}
			else{
				file.createNewFile();
				System.out.println("Created File" + "\n");
			}
		
			FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt",true);
			writer.append("Opened \n");
			writer.close();
		}
		catch(Exception e){
			System.out.println(e + "\n");
		}
		
	}
}