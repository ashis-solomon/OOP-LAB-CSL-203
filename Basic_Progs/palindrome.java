//Palindrome

import java.io.*;
import java.util.*;

class palindrome{
	public static void main(String[] args){
		System.out.println("Enter the string to check for : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		for(int i=0;i<len/2;i++){
			if(str.charAt(i)!=str.charAt(len-i-1)){
				System.out.println(str + " is NOT A PALINDROME !!");
				System.exit(0);
			}
		}	
		System.out.println(str + " is A PALINDROME !!");
	}
}

/* alt:

	String rev = "";
		for(int i=len-1;i>=0;i--){
			rev += str.charAt(i);
		}

		if(str.equals(rev)){
			System.out.println(str + " is a PALINDROME !!!\n");
		}else{
			System.out.println(str + " is NOT a PALINDROME !!\n");
		}
*/