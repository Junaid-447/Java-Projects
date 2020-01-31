package project6;

import java.util.Scanner;

public class Circle {
	float a=3.14f;
	float i,j;
	public Circle(float r)
	{
		i=r;
		System.out.println("Area of circle is:"+(a*r*r));
	}
	Circle(Circle d)
	{
		j=d.i;
		System.out.println("Area of circle is:"+(a*j*j));
	}
	public static void main(String a[])
	{
		float p;
		System.out.println("The radius of circle is:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		Circle a1=new Circle(p);
		Circle a2=new Circle(a1);
	}

}
