package task5;

import java.util.Arrays;

public class ZerosFromNonZeros {
	   public static void main(String args[]){
	      int[] myArray= {14, 0, 5, 2, 0, 3, 0};
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println("Resultant array: ");
	      int pos1 = 0;
	      for(int i=0; i<myArray.length; i++){
	         if(myArray[i]!=0){
	            myArray[pos1]=myArray[i];
	            pos1++;
	         }
	      }
	      while(pos1<myArray.length) {
	         myArray[pos1] = 0;
	         pos1++;
	      }
	      System.out.println("Moving zeros to end of the array will result "+Arrays.toString(myArray));
	      int pos2=myArray.length-1;
	      
	      for(int i=myArray.length-1; i>=0; i--){
		         if(myArray[i]!=0){
		            myArray[pos2]=myArray[i];
		            pos2--;
		         }
		      }
		      while(pos2>=0) {
		         myArray[pos2] = 0;
		         pos2--;
		      }
	      System.out.println("Moving zeros to front of the array will result "+Arrays.toString(myArray));

	   }
	}