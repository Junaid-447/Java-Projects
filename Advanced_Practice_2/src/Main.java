import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
 public static void main(String args[]) throws IOException{

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Integer playerCount,teamCount,matchCount,i,j;


 
  PlayerBO playerBO = new PlayerBO();
  String playerName,team,match;

    System.out.println("Enter the player count");
    playerCount = Integer.parseInt(br.readLine());

     Player playerList[] =new Player[playerCount];
    for(i=0;i<playerCount;i++)
    {
     System.out.println("Enter Player "+(i+1)+" details");
      playerName=br.readLine();
      playerList[i]=playerBO.createPlayer(playerName);
    } 
   
    
    TeamBO teamBO =new TeamBO();
    System.out.println("Enter the team count");
    teamCount = Integer.parseInt(br.readLine());

     Team teamList[] = new Team[teamCount];
    for(j=0;j<teamCount;j++)
    {
     System.out.println("Enter team "+(j+1)+" details");
      team=br.readLine();
      teamList[j] =teamBO.createTeam(team,playerList);
    }
   
    MatchBO matchBO=new MatchBO();
    System.out.println("Enter the match count");
     matchCount = Integer.parseInt(br.readLine());
     Match matchList[] = new Match[matchCount];
    for(j=0;j<matchCount;j++)
    {
     System.out.println("Enter match "+(j+1)+" details");
     match=br.readLine();
     matchList[j]=matchBO.createMatch(match,teamList);
    }
    Match ob=null;
    String con;
   do
    {

       System.out.println("Menu :");
       System.out.println("1)Find Team");
       System.out.println("2)Find All Matches In A Specific Venue");
       System.out.println("Type 1 or 2");
       System.out.println("Enter your choice");
       int ch=Integer.parseInt(br.readLine());
       
       if(ch==1)
       {
          System.out.println("Enter Match date");
          String matchDate=br.readLine();
          ob=matchBO.findTeam(matchDate,matchList);
          System.out.println(ob.getTeamone()+","+ob.getTeamtwo());
               
       }    
       if(ch==2)
       {
         
          System.out.println("Enter Team Name");
          String umpireName=br.readLine();
          System.out.println("Match Details:");
          System.out.format("%-15s %-15s %-15s %s\n","Date","TeamOne","TeamTwo","Venue");
           matchBO.findAllMatchesInGivenTeam(umpireName,matchList);
          
       } 

       System.out.println("Do you want to continue? Type Yes or No");
        con=br.readLine();

       }while(con.equals("Yes"));

 }
}
