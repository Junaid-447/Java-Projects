import java.util.HashMap;
import java.util.Map;

public class Map_demo {
	public static void main(String a[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"abc");
		hm.put(2,"xyz");
		hm.put(3,"pqr");
		hm.put(4,"xxx");
		hm.put(5,"yyy");
		hm.put(6,"qqq");
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
