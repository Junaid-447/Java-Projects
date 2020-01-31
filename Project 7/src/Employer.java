
import java.util.Scanner;

public class Employer {
	int Id;
	String name;
	static String comp="ABC";
	
	public Employer(int i, String n)
	{
		Id=i;
		name=n;
	}
	void display()
	{
		System.out.println("Employee-Id:"+Id+"\tEmployee name:"+name+"\t\tCompany name:"+comp);
	}
	
	public static void main(String a[])
	{
		System.out.println("Enter the details:");
		int y1,y2,y3;
		String z1,z2,z3;
		Scanner sc= new Scanner(System.in); 
		y1=sc.nextInt();
		z1=sc.next();
		y2=sc.nextInt();
		z2=sc.next();
		y3=sc.nextInt();
		z3=sc.next();
		Employer a1=new Employer(y1,z1);
		Employer a2=new Employer(y2,z2);
		Employer a3=new Employer(y3,z3);
		a1.display();
		a2.display();
		a3.display();
		
	}
}

