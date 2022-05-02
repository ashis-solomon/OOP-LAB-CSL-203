import java.io.*;
import java.util.*;


class filesearch{
	public static void main(String[] args){
		try{
			File file = new File("input.txt");
			
			FileReader reader = new FileReader("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/input.txt");
			int ch=0; char c;
			String str="";	
			String[] sp,line;

			while(ch!=-1){
				ch = reader.read();
				c = (char)ch;
				str += c;
			}

			FileWriter writer = new FileWriter("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/output.txt",true);
			File file2 = new File("C:/Users/ashis/OneDrive/Desktop/OOPS LAB PREP/File Handling/output.txt");
			if(!file2.exists()){file2.createNewFile();}


			sp = str.split("\n");
			System.out.println("Number of Lines = " + sp.length);
			System.out.println("Enter the Roll no to search for : ");
			Scanner sc = new Scanner(System.in);	
			int rno = sc.nextInt();
			for(int i=0;i<sp.length;i++){
				line = sp[i].split(" ");
				if(Integer.parseInt(line[0]) == rno){
					System.out.println("Name = " + line[1] + "\n");
					System.out.println("Mark1 = " + line[2] + "\n");
					System.out.println("Mark2 = " + line[3] + "\n");
					System.out.println("Mark3 = " + line[4] + "\n");
					int avg = (Integer.parseInt(line[2]) + Integer.parseInt(line[3]) + Integer.parseInt(line[4]))/3;
					System.out.println("Avg = " + avg + "\n");
					writer.append(line[1] + " " + line[2] + " " + line[3] + " " + line[4] + " " + avg + "\n");
				}
			}
			reader.close();
			writer.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}