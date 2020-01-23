
public class Exception_1 {
public static void main(String a[])
{
	int a1=10;
	int b=0;
	int c;
	
	try
	{
		c=(a1/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception Handeled");
	}
	System.out.println("Value of a"+a1);
	System.out.println("Value of b"+b);
	
}
}
