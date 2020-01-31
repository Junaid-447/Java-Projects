interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("draw Circle");
	}
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("draw Rectangle");
	}
}
public class Drawdemo1 {
	public static void main(String a[])
	{
	
	Shape s;
	s=new Circle();
    s.draw();
	s=new Rectangle();
    s.draw();
}
}
