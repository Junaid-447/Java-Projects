import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String a[])
{
	String k;
	int total=0;
	Scanner sc=new Scanner(System.in);
	TreeSet<Player>t=new TreeSet<Player>();
	do
	{
		System.out.println("Enter player name");
		String name=sc.nextLine();
		System.out.println("Enter skill");
		String skill=sc.nextLine();
		System.out.println("Do you want to continue(yes/no):");
		k=sc.nextLine();
		t.add(new Player(name,skill));
		
	}
	while(k.equalsIgnoreCase("yes"));
	
	Iterator itr=t.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}


}
