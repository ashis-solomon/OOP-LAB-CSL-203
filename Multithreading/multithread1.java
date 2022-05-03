import java.io.*;
import java.util.*;


class thread1 extends Thread {
	int num;
	thread1(int num){
		this.num = num;
	}
	public void run(){
		for(int i=1;i<=num;i++){
			System.out.print(i+"\t");
			try{
				Thread.sleep(1000);
			}catch(Exception e){ }	
		}
	}
}

class thread2 extends Thread{
	int num;
	thread2(int num){
		this.num = num;
	}
	public void run(){
		for(int i=10;i>=num;i--){
			System.out.println(i*10+"\n");
			try{
				Thread.sleep(2000);
			}catch(Exception e){ }	
		}
	}
}

class multithread1{
	public static void main(String[] args){
		thread1 t1 = new thread1(10);
		thread2 t2 = new thread2(2);
		

		t1.start();
		t2.start();
		System.out.println("Thread Count = " + Thread.activeCount() + "\n");
		try{
				Thread.sleep(11000);
			}catch(Exception e){ }	
		System.out.println("Next Thread Count = " + Thread.activeCount() + "\n");
	}
}