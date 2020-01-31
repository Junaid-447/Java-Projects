import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
	 Umpire u=null;
    String a[]=data.split(",");
    
    for(UmpireType ut:umpireTypeList)
    {
    	if(ut.getType().equals(a[1]))
    	{
    		u=new Umpire(a[0],ut);
    	}
    	
    }
    return u;
    
 }

}
