package viki;


public class Palendrom{

	public static void main(String[] args) {
      String str="121";
      String str1="";
      
      for(int i=str.length()-1;i>=0;i--)
      {
    	  str1=str1+str.charAt(i);
//		1
//		12
//		121
      }
      System.out.println(str1);
      if(str.equals(str1))
      {
    	  System.out.println("value is palendrom");
      }
      else 
      {
    	 System.out.println("value is not palendrom"); 
      }
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("give input value");
//		
//		String str=sc.next();
//		String str1="";
//		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			str1=str1+str.charAt(i);
//		}
//		System.out.println(str1);
//		if(str.equals(str1))
//	      {
//	    	  System.out.println("value is palendrom");
//	      }
//	      else 
//	      {
//	    	 System.out.println("value is not palendrom"); 
//	      }
	}

}
