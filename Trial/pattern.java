import java.io.*;
import java.util.*;


class pattern{
	public static void main(String[] args){
		int j=5;
		String sp = " ";
		String space,star;
		String st = "*";

		for(int i=1;i<j;i++){
			space=""; star ="";
			for(int k=0;k<j-i;k++){space+=sp;}
			for(int k=0;k<i;k++){star+=st;}
			System.out.println(space+star+space);
		}

	}	
}