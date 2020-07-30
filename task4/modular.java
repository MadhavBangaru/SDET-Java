package task4;

import java.util.Scanner;

public class modular {
	
	public static void main(String[] args) {
		
		final int M = 10000007;
		
		System.out.println("Enter");
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		double[] dec =new double[c];
		for(int i=0;i<c;i++) {
			
			dec[i]=sc.nextDouble();
		}
		
		for(int i=0;i<c;i++) {
			if(dec[i]%1!=0)
				System.out.println(dec[i]%M);
			else
				System.out.println(dec[i]);
		}
	}
	
}
