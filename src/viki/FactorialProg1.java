package viki;


public class FactorialProg1 {

	public static void main(String[] args) {

		int num=5;
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact+i;
			//5*1=5
			//4*5=20
			//3*20=60
			//2*60=120
			//1*120=120		
		}
		System.out.println(fact);
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		int fact=1;
//		for(int i=fact;i<=num;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);	
		
		
	}

}
