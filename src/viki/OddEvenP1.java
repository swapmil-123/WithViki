package viki;

import java.util.Scanner;

public class OddEvenP1 {

	public static void main(String[] args) {

//		int num   =   10;
//		if(num %2   ==  0)
//		{
//			System.out.println("number is prime");
		
		
//		}
//		else
//		{
//			System.out.println("number is non prime");
//		}
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Number");
		int num=sc.nextInt();
		
		if(num%2 ==0)
		{
			System.out.println("number is Even");
		}
		else
		{
			System.out.println("number is Odd");
		}
		
	}

}
