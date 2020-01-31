import java.util.Scanner;

public class Squaredemo {

	static int square(int x)
	{
	return x*x ;
	}


    public static void main(String a[])
    {
    	int x;
    	System.out.println("Enter the number:");
    	Scanner sc=new Scanner(System.in);
    	x=sc.nextInt();
    	int b=Squaredemo.square(x);
    	System.out.println("Square of the given number is:"+b);
    }
}