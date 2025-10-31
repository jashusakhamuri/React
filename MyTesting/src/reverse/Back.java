package reverse;

public class Back {
	public static void main (String[] args) {
		
		String normal = "Jashu";
			 /* int size	=normal.length() ;
			 System.out.println(size);
			 String news="";
			 
			 for (int i = size-1 ;i>=0;i--) {
				 news = news+normal.charAt(i);
				 
				 
			 }
			 System.out.println(news);
			 */
				
		
		 /*  char a[] = normal.toCharArray();
				  
		  String rev ="";
		  for (int i = a.length-1;i>=0;i--) {
			 rev+= a[i];
		  }
		  System.out.println(rev);
		  */
		
		//string Buffer ,String builder
		/* String Buffer a = new StringBuffer("Welcome")
		 * StringBuilder a = new StringBuilder("Welcome")
		 * String  s=  new String("Welcome") immutable 
		 * String S = "Jashu"
		 * 
		 * == to compare objects
		 * s1.equals() used to compare values
		 * SBF = s.reverse();
		 * SBL = s.reverse(); 
		 * muttable =  change, SBF,SBL  (append)
		 * immuttable =  can't change  (concat)
		 * 
		 * 
		 * 
		 */
		
		  String full= normal.concat("Sakhamuri");
		  System.out.println(normal);
		  System.out.println(full);
		  
		  StringBuffer  SBF = new StringBuffer("Jashu");
		   System.out.println(SBF.append("Sakhamuri"));
				  
		  
		  
		  
	}

}
