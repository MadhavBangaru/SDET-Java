package task3;

import java.util.Scanner;

public class regarHeap {
	
	/* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int n, int r, 
                          int index, int data[], int i) 
    { 
        // Current combination is ready to be printed,  
        // print it 
        if (index == r) { 
            for (int j = 0; j < r; j++) 
                System.out.print(data[j] + " "); 
            System.out.println(""); 
            return; 
        } 
  
        // When no more elements are there to put in data[] 
        if (i >= n) 
            return; 
  
        // current is included, put next at next 
        // location 
        data[index] = arr[i]; 
        combinationUtil(arr, n, r, index + 1,  
                               data, i + 1); 
  
        // current is excluded, replace it with 
        // next (Note that i+1 is passed, but 
        // index is not changed) 
        combinationUtil(arr, n, r, index, data, i + 1); 
    } 
  
    // The main function that prints all combinations 
    // of size r in arr[] of size n. This function  
    // mainly uses combinationUtil() 
    static void printCombination(int arr[], int n, int r) 
    { 
        // A temporary array to store all combination 
        // one by one 
        int data[] = new int[r]; 
  
        // Print all combination using temprary 
        // array 'data[]' 
        combinationUtil(arr, n, r, 0, data, 0); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int arrSize=0;
		int subSize=0;
		int elePop=0;
		
		for(int i=0;i<c;i++) {
			arrSize=sc.nextInt();
			subSize=sc.nextInt();
			elePop=sc.nextInt();
			
		}
		int[] arr = new int[arrSize];
		for(int j=0;j<arrSize;j++) {
			arr[j]=sc.nextInt();
		}
		
		printCombination(arr,arrSize,subSize);
			  
		
		  

		    

	}

}
/*
 * public class demo { static int nCr(int n, int r) { return fact(n) / (fact(r)
 * * fact(n - r)); }
 * 
 * // Returns factorial of n static int fact(int n) { int res = 1; for (int i =
 * 2; i <= n; i++) res = res * i; return res; }
 * 
 * public static void main(String[] args) {
 * 
 * 
 * int[] arr = new int[] {4,2,1,5};
 * 
 * int noOfsub = nCr(arr.length, 2); System.out.println(noOfsub);
 * ArrayList<Integer> al = new ArrayList<Integer>();
 * 
 * for(int i=0;i<arr.length;i++) { al.add(arr[i]); }
 * 
 * int[][] subs = new int[noOfsub][2];
 * 
 * for(int j=0;j<noOfsub;j++) { for(int k=0;k<2;k++) { subs[j][k] = al.get(i);
 * 
 * } String arr1 = Arrays.toString(arr);
 * 
 * 
 * 
 * Collections.sort(al);
 * 
 * 
 * System.out.println(arr1);
 * 
 * 
 * 
 * 
 * }
 * 
 */
