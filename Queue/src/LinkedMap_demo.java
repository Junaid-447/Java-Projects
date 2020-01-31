
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedMap_demo {

	public static void main(String a[])
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1,"abc");
		lhm.put(2,"xyz");
		lhm.put(3,"pqr");
		
		for(Map.Entry n:lhm.entrySet())
		{
			System.out.println(n.getKey()+" "+n.getValue());
		}
	}

}