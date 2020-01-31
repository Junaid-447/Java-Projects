import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

public static void main(String a[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of best bowlers in season 4");
	int n=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of players");
	ArrayList<String>al=new ArrayList<String>(n);
	for(int i=0;i<n;i++)
	{
		al.add(sc.nextLine());
	}
	TreeSet<String> tmp = new TreeSet<String>(al);

	TreeSet<String>t=new TreeSet<String>();
	t.addAll(al);
	al.removeAll(al);
	System.out.println("Enter the number of best bowlers in season 5");
	int n1=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of players");
	for(int i=0;i<n1;i++)
	{
		al.add(sc.nextLine());
	}

	TreeSet<String>t1=new TreeSet<String>(al);
	
	System.out.println("Player Set 1");
	Iterator itr=t.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("Player Set 2");
	Iterator itr1=t1.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	System.out.println("Difference");
    tmp.removeAll(al);
    Iterator itr2=tmp.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
	 
}



}
