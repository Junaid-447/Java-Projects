import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Histogram {
private TreeMap<Integer,Integer>hm=new TreeMap<>();
int count1=0,count2=0,count3=0,count=0;
public void addScore(int x)
{
	if(x>10 && x<=20)
	{
		count++;
		
	}
	else if(x>20 && x<=30)
	{
		count1++;
	}
	
	else if(x>30 && x<=40)
	{
		count2++;
	}
	else if(x>0 &&x<=10)
	{
		count3++;
	}
	
	hm.put(20,count);
	hm.put(30,count1);
	hm.put(40,count2);
	hm.put(10,count3);
	
}
public void displayHistogram()
{
	
	 SortedSet<Integer> keys = new TreeSet<Integer>(hm.keySet());
     String s = "";
     for(Integer key : keys){
    	
         s += key + " : ";
         for(int i = 0; i<hm.get(key); i++)
         {
             s+="*";
         }
         s+="\n";
     }
     System.out.println(s);
}
}
