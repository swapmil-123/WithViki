package demo;

public class Prog1 {

	public static void main(String[] args) {
	int i,j,end=21,isprime=1,sum=0;
	for(i=2;i<=end;i++)
	{
		for(j=2;j<i/2;j++)
		{
			if(i%j==0)
			{
				isprime=0;
				break;
			}
			
		}
		if(isprime==1)
		{
			sum+=i;
		}
	}
	System.out.println(sum);


}
}