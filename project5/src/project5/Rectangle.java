package project5;

import java.util.Scanner;

public class Rectangle {
	public Rectangle(float a, float b)
	{
		System.out.println("This is the area of rectangle:"+(a*b));
		System.out.println("This is the perimeter of rectangle:"+(a+a+b+b));
	}
	public static void main(String a[])
	{
		float p,q;
		System.out.println("Length and Breadth of rectangle are:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		q=sc.nextFloat();
		Rectangle c=new Rectangle(p,q);
	}

}
