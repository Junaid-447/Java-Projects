
public class Exception_2 {
public static void main(String a[])
{
	int a1=10;
	int b=0,d,c;
	String s=null;
	
	try
	{
		 c=a1/b;
		 
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic handeled");
	}
	try
	{
		d=s.length();
	}
	
	catch(NullPointerException e)
	{
		System.out.println("Null Pointer Handeled");
	}
	
	System.out.println("String is\t"+s);
}

}
