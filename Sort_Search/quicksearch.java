import java.io.*;
import java.util.*;


class quicksearch{
	static int partition(int[] arr,int low ,int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<=high;j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}	

	static void quicksort(int[] arr,int low,int high){
		if(low<high){
			int p = partition(arr,low,high);
			quicksort(arr,low,p-1);
			quicksort(arr,p+1,high);
		}
	}
	
	static int binsearch(int[] arr,int low,int high,int ele){
		while(low<=high){
			int mid = (low+high)/2;
			
			if(arr[mid] == ele){return mid;}
			else if(ele<arr[mid]){high = mid-1;}
			else if(ele>arr[mid]){low = mid+1;}
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
		int num  = 3;
		int index = binsearch(arr,0,arr.length-1,num);
		if(index!=-1){
			System.out.println("Searched for " + num + " , index = " + index);
		}
		else{
			System.out.println("Element not found in the LIST!!\n");
		}
	}
}