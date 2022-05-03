import java.io.*;
import java.util.*;


class strtok_split{
	public static void main(String[] args){
		String str = "A B C D E F";

		String[] str1 = str.split(" ");
	
		StringTokenizer st = new StringTokenizer(str," ");
		String[] str2 = new String[100]; 
		int i=0;
		while(st.hasMoreTokens()){
			str2[i++] = st.nextToken();
		}
		
		System.out.println(str1[0] + "\t" + str1[str1.length - 1] + "\n");

		
		System.out.println(str2[0] + "\t" + str2[i-1] + "\n");
	}	
}