interface showable
{
	void show();
}
interface prinatable
{
	void print();
}
public class Demointerface {
	void show()
	{
		System.out.println("Show the output");				
	}
	void print()
	{
		System.out.println("Print the output");	
	}
	public static void main(String a[])
	{
		Demointerface a1=new Demointerface();
		a1.show();
		a1.print();																				
	}

}
