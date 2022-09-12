package viki;

public class ArmstringNum {

	public static void main(String[] args) {
		int num =372, sum=0;
		int num1=num;
		while(num>0)
		{
			int temp=num%10;
			sum=sum+(temp*temp*temp);
			num=num/10;
		}
		System.out.println(sum);
		if(num1	==	sum)			//371	==	371
		{
		System.out.println("Armstrong	number");
		}
		else
		{
		System.out.println("Not");
		}
	}

}
