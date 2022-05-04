import java.io.*;
import java.util.*;

class node{
	int data;
	node prev;
	node next;
	node(int data){
		this.data = data;
		prev = null;
		next = null;
	}
}

class DLL{
	node head = null;
	
	public void insert_end(int data){
		node newNode = new node(data);
		if(head == null){
			head = newNode;
			return;
		}
		node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	public void insert_front(int data){
		if(head==null){
			node newNode = new node(data);
			head = newNode;
			return;
		}
		node newNode = new node(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void delete(int ele){
		node temp = head;
		node pre = head;
		if(head==null){
			System.out.println("The List is EMPTY!!");
			return;
		}
		if(head.data == ele){
			head = head.next;
			head.prev = null;
			return;
		}
		while(temp!=null && temp.data!=ele){
			pre = temp;
			temp = temp.next;
		}
		if(temp==null){
			System.out.println("The element is not in the LIST!!");
			return;
		}
		else if(temp.data == ele && temp.next == null){
			pre.next = null;
		}
		else if(temp.data == ele){
			pre.next = temp.next;
			temp.next.prev = pre;
		}
	
	}

	public void display(){
		if(head==null){
			System.out.println("The List is EMPTY!!");
			return;
		}
		node temp = head;
		while(temp!=null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println("\n");
	}
}


class doublyll{
	public static void main(String[]  args){
		DLL dll = new DLL();
		dll.display();
		dll.insert_end(1);
		dll.insert_end(2);
		dll.insert_end(11);
		dll.insert_end(22);
		dll.insert_front(3);
		dll.insert_front(4);
		dll.insert_front(33);
		dll.insert_front(44);
		dll.display();
		dll.delete(44);
		dll.delete(33);
		dll.delete(3);
		dll.delete(22);
		dll.delete(11);
		dll.display();
	}
}