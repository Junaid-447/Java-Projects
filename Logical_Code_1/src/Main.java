import java.util.Scanner;

public class Main {
public static void main(String a[])
{
	int k;
	String n="Sharma";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of players");
	k=sc.nextInt();
	System.out.println("Enter player names");
	
	sc.nextLine();
	String arr[]=new String[k];
	String arr1[]=new String[k];
	for(int i=0;i<k;i++)
	{
		arr[i]=sc.nextLine();
		
	}
	for(int i=0;i<k;i++)
	{
		boolean o=arr[i].contains(n);
		if(o)
		{
			System.out.println(arr[i]);
			
		}
	}
}
}