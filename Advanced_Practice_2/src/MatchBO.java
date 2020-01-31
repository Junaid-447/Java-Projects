import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
     
	 String c[]=data.split(",");
	 Match m=null;
	 for(Team t:teamList)
	 {
		 if(t.getName().equals(c[1])||t.getName().equals(c[2]))
		 {
			 m=new Match(c[0],c[1],c[2],c[3],t);
		 }
	 }
	 return m;
	
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
	  System.out.println("Team");
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

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
    for(int i=0;i<matchList.length;i++)
    {
    	if(matchList[i].teamone.equals(teamName)||matchList[i].teamtwo.equals(teamName))
    	{
    		System.out.println(matchList[i].toString());
    	}
    }
  
   }


  
}
