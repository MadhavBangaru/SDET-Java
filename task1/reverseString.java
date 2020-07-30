package task1;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		
		StringBuffer sb = new StringBuffer(str);
		
		String rev = sb.reverse().toString();
		
		System.out.println(rev);
	}

	
	
}
