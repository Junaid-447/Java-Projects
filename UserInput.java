import java.util.Scanner;

public class UserInput
{
	
	void add(int a,int b)
	{
		System.out.println("The addition is:"+(a+b));
	}
	
	public static void main(String a[])
	{
		int p,q;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		UserInput i=new UserInput();
		i.add(p,q);
	}
}
