class Grandparent 
{
	String name;
	static int age;
	public Grandparent(String n,int i)
	{
		name=n;
		age=i;
		System.out.println("Name of Grandparent is:"+name+"\tAge is:"+age);
	}
}
class Parent extends Grandparent
{
	static String name;
	String business;
	
	public Parent(String a,String b)
	{
		super("Noor", 67);
		name=a;
		business=b;
		System.out.println("Name of parent is:"+name+"\tBusiness is:"+business);
	}
	
}
class Child extends Parent
{
	static String name;
	String college;
	public Child(String c, String d)
	{
		super("Nizar Ali","Job");
		name=c;
		college=d;
		System.out.println("Name of child:"+name+"\t\tCollege is:"+college);
	}
}
public class SuperDemo {
	public static void main(String a[])
	{
		Child p1=new Child("Junaid","VIT");
		
	}

}
