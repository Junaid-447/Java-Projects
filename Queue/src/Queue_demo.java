import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_demo {
	public static void  main(String a [])
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("abc");
		pq.add("pqr");
		pq.add("zzz");
		System.out.println(pq.peek());
	    System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq.element());
		System.out.println(pq.size());
		System.out.println(pq.offer("yyy"));
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
