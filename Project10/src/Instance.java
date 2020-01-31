import java.util.Scanner;

public class Instance {
	int roll,roll1;
	String name,name1;
	
	public Instance()
	{
		System.out.println("\t\tName of student:Junaid"+"\tRoll no:1");
	}
	public Instance(String n,int p) {
		roll=p;
		name=n;
		System.out.println("\t\tName of student:"+name+"\tRoll no:"+roll);
	}
     Instance(Instance a1)
     {
    	 roll1=a1.roll;
    	 name1=a1.name;
    	 
    	System.out.println("\t\tName of student:"+name1+"\tRoll no:"+roll1);
     }
     {
    	 System.out.println("Name of College is:VIT");
     }
     public static void main(String a[])
     {
    	int y;
    	String x;
    	System.out.println("Enter the details:");
    	Scanner sc=new Scanner(System.in);
    	y=sc.nextInt();
    	x=sc.next();
    
    	Instance a3=new Instance(); 
    	
    	Instance a1=new Instance("Junaid",1);
    	Instance a2=new Instance(a1);
     }
}
