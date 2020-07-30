package task1;

import java.util.Scanner;

public class powerOf2 
	{ 
	/* Function to check if x is power of 2*/
	static boolean isPowerOfTwo(int n) 
	{ 
	    if(n==0) 
	    return false; 
	  
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
	       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 
	  
	// Driver Code 
	public static void main(String[] args) 
	{ 
		
		  System.out.println("Enter no");
		  Scanner sc = new Scanner(System.in);
		  int a = sc.nextInt();
		  
		  int arr[] = new int[a];
		  for(int i=0;i<a;i++){
		  	
		  arr[i] = sc.nextInt();
		  }
		  
		for(int i=0;i<a;i++) {  
		    if(isPowerOfTwo(arr[i])) 
		    System.out.println("Yes"); 
		    else
		    System.out.println("No"); 
		}
		sc.close();
	     
	} 
	
	}

