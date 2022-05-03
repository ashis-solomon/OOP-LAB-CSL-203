import java.io.*;
import java.util.*;

class random extends Thread{
	
	public void run(){
		Random r = new Random();
		for(int i=0;i<5;i++){
			int num = r.nextInt(10);
			if(num%2==0){
				even e = new even(num);
				e.start();
			}
			else{
				odd o = new odd(num);
				o.start();
			}
			try{Thread.sleep(1000);}catch(Exception e){ }
		}
		
	}
}

class even extends Thread{
	int num;
	even(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Square of " + num + " is  =  " + num*num + " !\n");
	}
}

class odd extends Thread{
	int num;
	odd(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Cube of " + num + " is  =  " + num*num*num + " !\n");
	}
}

class multithread2{
	public static void main(String[] args){
		random r = new random();
		r.start();
	}
}