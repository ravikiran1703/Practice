package Java;

public class StringvsStringBuildervsStringBuffer {
	 public static void concat1(String s1) 
	    { 
	        s1 = s1 + "forgeeks"; 
	    } 
	
	    // Concatenates to StringBuilder 
	    public static void concat2(StringBuilder s2) 
	    { 
	        s2.append("forgeeks"); 
	    } 
	  
	    // Concatenates to StringBuffer 
	    public static void concat3(StringBuffer s3) 
	    { 
	        s3.append("forgeeks"); 
	    } 
	public static void main(String[] args) {
//		String s1  = "first";
//		//concat1(s1);
//		
//		s1 = s1 + "12324";
//		
//		System.out.println("str: " +s1);
//
//        StringBuilder s2 = new StringBuilder("Geeks"); 
//		concat2(s2);
//		System.out.println("builder: " +s2);
//		
//		StringBuffer s3 = new StringBuffer("Geeks"); 
//        concat3(s3); // s3 is changed 
//
//		System.out.println("buffer: "+s3);
//		
//		
		
			StringBuilder sb=new StringBuilder("Hello");  
			sb.replace(0,2,"J");  
			System.out.println(sb);//prints HJavalo  
			
	}  
			
	}


