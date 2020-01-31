import java.util.Scanner;

public class Main {
public static void main(String a[])
{
	String n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter team details");
	n=sc.nextLine();
	System.out.println("After replacement");
	System.out.println(n.replaceAll("Captain","Skipper"));
	
}
}
