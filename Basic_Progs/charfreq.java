import java.io.*;
import java.util.*;

class charfreq{
	public static void main(String[] args){
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the character to search for : ");
		char ch = sc.nextLine().charAt(0);
		char[] st = str.toCharArray();
		int count = 0;
		for(int i=0;i<st.length;i++){
			if(st[i] == ch){count++;}
		}
		System.out.println("\nThe character '" + ch + "' appeared " + count + " times !\n");
	}
}