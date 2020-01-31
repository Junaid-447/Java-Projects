package project4;

import java.util.Scanner;

public class circle {
	float a=3.14f;
	
	public circle(float r)
	{
		System.out.println("The area of circle is:"+(a*r*r));
		System.out.println("The perimeter of circle is:"+(2*a*r));
		System.out.println("The diameter of circle is:"+(2*r));
	}
	public static void main(String a[])
	{
		float p ;
		System.out.println("Enter the value of r:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		circle y =new circle(p);	
	}

}
