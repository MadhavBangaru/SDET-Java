package task1;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		
		int[] rev = new int[a.length];
		
		for(int i=a.length-1;i>=0;i--) {
			rev[a.length-1-i] = a[i];
		}
		
		for(int j=0;j<rev.length;j++) {
		System.out.println(rev[j]);
	}

}
}