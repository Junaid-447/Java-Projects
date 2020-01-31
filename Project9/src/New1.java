import java.util.Scanner;

public class New1 {
	int roll;
	String name;
	float per;
	void insert(int roll,String name,float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println("Roll no is:"+roll+"\tName is:"+name+"\tPercentage is:"+per);
	}
	public static void main(String a[])
	{
		int p1,p2;
		float q1,q2;
		String r1,r2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rollno:");
		p1=sc.nextInt();
		p2=sc.nextInt();
		System.out.println("Enter the percentage:");
		q1=sc.nextFloat();
		q2=sc.nextFloat();
		System.out.println("Enter the Names:");
		r1=sc.next();
		r2=sc.next();
		New1 a1=new New1();
		New1 a2=new New1();
		a1.insert(p1,r1,q1);
		a2.insert(p2, r2, q2);
		a1.display();
		a2.display();
	}
}

