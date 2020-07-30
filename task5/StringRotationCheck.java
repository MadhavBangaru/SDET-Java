package task5;

public class StringRotationCheck {
	 public static boolean checkRotation(String st1, String st2) {  
	        if (st1.length() != st2.length()) {  
	            return false;  
	        }  
	        String st3 = st1 + st1;  
	        if (st3.contains(st2))  
	            return true;  
	        else  
	            return false;  
	    }  
	   
	    public static void main(String[] args) {  
	        String str1 = "JavaJ2eeStrutsHibernate";  
	        String[] str2 = {"StrutsHibernateJavaJ2ee",
	        				"J2eeStrutsHibernateJava",
	        				"HibernateJavaJ2eeStruts"
	        		
	        		
	        };  
	        
	        System.out.println("Checking if a string is rotation of another");  
	        
	        for(int i=0;i<str2.length;i++) {
		        if (checkRotation(str1, str2[i])) {  
		            System.out.println("Yes " + str2[i] + " is rotation of " + str1);  
		        } else {  
		            System.out.println("No " + str2[i] + " is not rotation of " + str1);  
		        } 
	        }
	    }  
	}  