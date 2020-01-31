import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
 public static void main(String args[]) throws IOException{

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

  Integer numberOfPlayers,i,ch;
  String name,country,skillName;

  System.out.println("Enter number of Players");
   numberOfPlayers=Integer.parseInt(br.readLine());
  Player playerList[] = new Player[numberOfPlayers];

  PlayerBO playerBo=new PlayerBO();

  Skill skill=new Skill();

 for(i=0;i<numberOfPlayers;i++)
 {
  playerList[i]=new Player();
  System.out.println("Enter player "+(i+1)+" details:");
  System.out.println("Enter player name");
  name=br.readLine();


  System.out.println("Enter country name");
  country=br.readLine();

  System.out.println("Enter skill");

  skillName=br.readLine();
  skill=new Skill(skillName);  

    playerList[i] = new Player(name,country,skill);

 }

 
  do
  {

   System.out.println("Menu:");
   System.out.println("1.View details");
   System.out.println("2.Filter players with skill");
   System.out.println("3.Exit");
    
   ch=Integer.parseInt(br.readLine());

   if(ch==1)
   {
       System.out.format("%-15s %-15s %-15s\n","Player","Country","Skill");
       
        playerBo.viewDetails(playerList);
   }
   else if(ch==2)
   {
        System.out.println("Enter skill");
        skillName=br.readLine();
        System.out.format("%-15s %-15s %-15s\n","Player","Country","Skill");
     
        playerBo.printPlayerDetailsWithSkill(playerList,skillName);
 
   }  
   else
    break;

    }while(ch<=2);
  }

}

