import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class PlayerBO
{

  public Player createPlayer(String data)
   {
     String a[]=data.split(",");
     Player p=new Player(a[0],a[1],a[2]);
	return p;
     
   }
 

}
