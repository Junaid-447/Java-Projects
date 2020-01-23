
public class Exception_3 {
	
	public static void main(String s[])
	{
		int a1[]=new int [5];
		int b=20;                          
		int c=0,d;
		
		try
		{
			a1[15]=25;
		}
		catch(Exception e)
		{
			System.out.println("Exception Handeled1");
		}
		finally
		{
			System.out.println("Exception handeled");
		}
		
	}

}
