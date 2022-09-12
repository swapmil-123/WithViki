package viki;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num=12345;
		int revnum=0;
		int mf=10000;
		for(int i=0;i<=5;i++)
		{
		int temp=num%10;
		num=num/10;
		revnum=revnum+temp*mf;
		mf=mf/10;

		}
		
		System.out.println(revnum);
		
		int num1=111;
		int revnum1=0;
		int mf1=100;
		for(int i =0;i<=3;i++)
		{
			int temp=num1%10;
			num1=num1/10;
			revnum1=revnum1+temp*mf1;
			mf1=mf1/10;							
		}
		System.out.println(revnum1);
		
		
	}

}
