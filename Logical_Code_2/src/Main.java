import java.util.Scanner;

public class Main {
	
public static void main(String a[])
{
	int count=0;

	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int n=sc.nextInt();
	int k=0;
	int m=n;
	boolean f=sc.nextBoolean();
	
	if(f==false)
	{
		    if(x<=n)
		    {
			count++;
			n=n-x;
		    }
		    
		    
		     if(y<=n)
			{
				count++;
				 n=n-y;
			}
		    
		     if(z<=n)
				{
					count++;
				
				}
	System.out.println(count);
}
else
{
	System.out.println(3);
}
}
}