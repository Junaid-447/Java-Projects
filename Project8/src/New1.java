
import java.util.Scanner;

public class New1 {
	int Id;
	String name;
	static String company;
	static
	{
		company="ABC";
	}
	
	public New1(int i, String n)
	{
		Id=i;
		name=n;
	}
	void display()
	{
		System.out.println("Employee-Id:"+Id+"\tEmployee name:"+name+"\t\tCompany name:"+company);
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
		New1 a1=new New1(y1,z1);
		New1 a2=new New1(y2,z2);
		New1 a3=new New1(y3,z3);
		
		a1.display();
		a2.display();
		a3.display();
		
	}
}

