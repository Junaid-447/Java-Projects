import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TeamBO
{

  
 public Team createTeam(String data, Player[] playerList)
 {
  
	
	Team j=null;
    String b[]=data.split(",");
    for(Player p:playerList)
    {
    	if(p.getName().equals(b[1]))
    	{
    		j= new Team(b[0],p);
    	}
    }
    return j;

    
 }
 


}
