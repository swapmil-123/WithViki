package demo;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {

//		String str="swapnil";
//		String str1="";
//		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			str1=str1+str.charAt(i);
//		}
//		System.out.print(str1);		
//		}
		
	
	Scanner sc =new Scanner(System.in);
	System.out.println("give input string");
	
	String str=sc.next();
	String str1="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		str1=str1+str.charAt(i);
	}
	System.out.println(str1);
	
	}
}


