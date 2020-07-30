package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo {
	static int nCr(int n, int r) 
	{ 
		return fact(n) / (fact(r) * 
				fact(n - r)); 
	} 

	// Returns factorial of n 
	static int fact(int n) 
	{ 
		int res = 1; 
		for (int i = 2; i <= n; i++) 
			res = res * i; 
		return res; 
	} 

	public static void main(String[] args) {


		int[] arr = new int[] {4,2,1,5};

		int noOfsub = nCr(arr.length, 2);
		System.out.println(noOfsub);
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		
		int[][] subs = new int[noOfsub][2];
		
		for(int j=0;j<noOfsub;j++) {
			for(int k=0;k<2;k++) {
			//subs[j][k] = al.get(i);

		}
		String arr1 = Arrays.toString(arr);

		

		Collections.sort(al);


		System.out.println(arr1);




	}

}
}