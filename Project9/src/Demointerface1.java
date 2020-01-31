interface Showable
{
	void show();
}
interface Printable
{
	default void print()
	{
		System.out.println("Default Method");
	}
	static int cube(int x)
	{
		
		return x*x*x;
	}
}
public class Demointerface1 implements Showable,Printable {
	public void show()
	{
		System.out.println("Show method called");
	}
	public static void main(String a[])
	{
		Showable s1=new Demointerface1();
		Printable p1=new Demointerface1();
		s1.show();
		p1.print();
		System.out.println("Cube is:"+Printable.cube(5));
	}

}

