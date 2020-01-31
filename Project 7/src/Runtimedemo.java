import java.util.Scanner;

class Person
{
	int age;
	int id;
	void detail(int a,int b)
	{
		age=a;
		id=b;
		System.out.println("Age of person is:"+age+"Id number:"+id);
	}
}
class Student extends Person
{
	String name;
	String colg;
	void detail(String y,String z)
	{
		name=y;
		colg=z;
		System.out.println("Name of student is:"+name+"Name of college is:"+colg);
	}
}
public class Runtimedemo {
	public static void main(String a[])
	{
		int p,q;
		String r,s;
		System.out.println("Enter the details:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		r=sc.next();
		s=sc.next();
		
		Person p1=new Student();
		p1.detail(18,1);
		
	}

}
