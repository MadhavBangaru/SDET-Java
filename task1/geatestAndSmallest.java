package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class geatestAndSmallest {
	
	
	public static int greaterSmall(int[] arr, int k) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<k) {
				al.add(arr[i]);
			}
		}
		Collections.sort(al);
		
		int smallerThanK =  al.get(al.size()-1);
		
		return smallerThanK;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		

		
		int noEle = sc.nextInt();
		int queries = sc.nextInt();
		
		int[] arr = new int[noEle];
		int[] qEle = new int[queries];
		
		for(int j=0;j<noEle;j++) {
			arr[j]=sc.nextInt();
		}
		
		for(int k=0;k<queries;k++) {
			qEle[k]=sc.nextInt();
		}
		
		for(int l=0;l<queries;l++) {
		System.out.println(greaterSmall(arr,qEle[l]));
		}
		
		sc.close();
	}
	

}
