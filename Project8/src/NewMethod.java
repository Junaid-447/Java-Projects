import java.util.Scanner;

public class NewMethod {
String name;
int roll;
static String colg;
	static String college(String c)
	{
		 return colg=c;
	}
	void name1(String b,int x) {
		name=b;
		roll=x; 
	}
	void display()
	{
		System.out.println("Roll no:"+roll+"\tName of student:"+name+"\tCollege name:"+colg);
	}
	public static void main(String a[])
	{
		String y,z1,z2;
		int x1,x2;
		System.out.println("Enter the college name:");
		Scanner sc=new Scanner(System.in);
		y=sc.next();
		String c=NewMethod.college(y);
		System.out.println("Enter the roll1 no:");
		x1=sc.nextInt();
		System.out.println("Enter the name1:");
		z1=sc.next();
		System.out.println("Enter the roll2 no:");
		x2=sc.nextInt();
		System.out.println("Enter the name2:");
		z2=sc.next();
		
		NewMethod a1= new NewMethod();
		NewMethod a2= new NewMethod();
		
		a1.name1(z1,x1);
		a2.name1(z2,x2);
		a1.display();
		a2.display();
	}
}
