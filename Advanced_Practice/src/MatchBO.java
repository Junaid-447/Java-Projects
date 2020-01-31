import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
     Match m=null;
     String b[]=data.split(",");
     for(Umpire u:umpireList)
     {
    	 if(u.getName().equals(b[3]))
    	 {
    		 m=new Match(b[0],b[1],b[2],u);
    		 break;
    	 }
     }
     return m;
	 
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
	  Match m1=null;
       for(Match m:matchList)
       {
    	   if(m.date.equals(matchDate))
    	   {
    		   m1=m;
    	   }
       }
       return m1;
  }
 
  public void findAllMatchesOfGivenUmpire(String umpireName, Match[] matchList)
  {
           for(int i=0;i<matchList.length;i++)
           {
        	   if(matchList[i].umpire.getName().equals(umpireName))
        	   {
        		   System.out.println(matchList[i].toString());
        	   }
           }
  }
}
