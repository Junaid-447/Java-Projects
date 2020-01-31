import java.util.Scanner;
class Shape
{
protected String shapeName;

public String getShapeName() {
	return shapeName;
}
public void setShapeName(String shapeName) {
	this.shapeName = shapeName;
}

Shape(String shapeName)
	{
		this.shapeName=shapeName;
	}
public double calculateArea()
	{
		return 0;
	}
}
class Square extends Shape
{
private int side;

public int getSide() {
	return side;
}
public void setSide(int side) {
	this.side = side;
}
Square(int side) {
		super("Square");
		this.side = side;
	}
public double calculateArea()
{
	double area;
	area=side*side;
	return area;
}
}
class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	Rectangle(int length, int breadth) {
		super("Recatngle");
		this.length = length;
		this.breadth = breadth;
	}
public double calculateArea()
	{
		double area;
		area=length*breadth;
		return area;
	}
}
class Circle extends Shape
{
	private int radius;

public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
public double calculateArea()
	{
		double area;
		double pi=Math.PI;
		area=pi*radius*radius;
		return area;
	}
}
public class Main {	
	public static void main(String a[])
	{
		int n,m,p,q,r;
		System.out.println("1. Rectangle\n2. Square\n3. Circle");
		Scanner sc=new Scanner(System.in);
		System.out.println("Area Calculator --- Choose your shape");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter length and breadth:");
			m=sc.nextInt();
			p=sc.nextInt();
			Shape s=new Rectangle(m,p);
			System.out.printf("Area of Rectangle is:%.2f",s.calculateArea());
			break;
		}
		case 2:
		{
			System.out.println("Enter side:");
			q=sc.nextInt();
			Shape s1=new Square(q);
			
			System.out.printf("Area of Square is:%.2f",s1.calculateArea());
			break;
		}
		case 3:
		{
			System.out.println("Enter Radius:");
			r=sc.nextInt();
			Shape s2=new Circle(r);
			System.out.printf("Area of Circle is:%.2f",s2.calculateArea());
			break;
		}
		}
		
	}
}

