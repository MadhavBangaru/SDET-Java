package task1;

import java.util.Scanner;

public class swap {
	
		public static int[] swaps(int a, int b) {
			 int[] ans = new int[2];
		        a = a + b; 
		        b = a - b; 
		        a = a - b;
		        ans[0] =a;
		        ans[1] =b;
		        
		        return ans;
		}
	    public static void main(String a[]) 
	    { 
	    	System.out.println("Enter");
	    	Scanner sc = new Scanner(System.in);
	    	
	    	
	    	int a1 = sc.nextInt();
	    	
	    	int[] x = new int[a1];
	    	int[] y = new int[a1];
	    	
	    	for(int i=0;i<a1;i++) {
	    		x[i]=sc.nextInt();
	    		y[i]=sc.nextInt();
	    	}
	    	
	    	for(int i=0;i<a1;i++) {
	    		int[] ans = swaps(x[i],y[i]);
	    		System.out.println(ans[0]+" "+ans[1]);
	    		
	    	}
	       
	        
	    } 
	} 