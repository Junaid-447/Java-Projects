import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue_demo1 {
	public static void main(String a[])
	{
		Deque<String>de=new LinkedList<String>();
		
		de.add("abc");
		
		de.add("xyz");
	
		de.add("pqr");
		Iterator itr1=de.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(de.getFirst());
		System.out.println(de.getLast());
		System.out.println(de.element());
		System.out.println(de.size());
		System.out.println(de.offerFirst("efg"));
		System.out.println(de.peek());
		System.out.println(de.poll());
		System.out.println(de.removeLast());
	}

}
