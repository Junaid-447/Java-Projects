  import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n1,n2;
		System.out.println("Enter the team count");
		n1=Integer.parseInt(br.readLine());
		Team [] teamList=new Team[n1];
		TeamBO teamBO=new TeamBO();
		
		String t,p;
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter team "+(i+1)+" details");
			t=br.readLine();
			teamList[i]=teamBO.createTeam(t);
		}
		
		System.out.println("Enter the player count");
		n2=Integer.parseInt(br.readLine());
		Player [] playerList=new Player[n2];
		PlayerBO playerBO=new PlayerBO();
		for(int i=0;i<n2;i++)
		{
			System.out.println("Enter player "+(i+1)+" details");
			p=br.readLine();
			playerList[i]=playerBO.createPlayer(p, teamList);
					
		}
		
		System.out.println("Enter the player name for which you need to find the team name");
		String name=br.readLine();
		System.out.println(name+" belongs to "+playerBO.findTeamName(playerList,name));
		System.out.println("Enter 2 player names");
		String name1=br.readLine();
		String name2=br.readLine();
		if(playerBO.findWhetherPlayersAreInSameTeam(playerList,name1,name2))
			System.out.println("The 2 player are in the same team");
		else
			System.out.println("The 2 player are in the different teams");
		

	}

}





