  public class PlayerBO {
    public Player createPlayer(String data, Team[] teamList)
	{
		//fill your code;
    	Player r=null;
        String b[]=data.split(",");
        
        for(Team t:teamList)
        {
        	if(t.getName().equals(b[1]))
        	{
        		r=new Player(b[0],t);
        	}
        	
        }
        return r;
	}
	
	public String findTeamName(Player[] playerList, String playername)
	{
		int k=0;
		for(int i=0;i<playerList.length;i++)
		{
			if(playerList[i].getName().equals(playername))
			{
				k=i;
			}
		}
		return playerList[k].getTeam().getName();
	}
	
	public Boolean findWhetherPlayersAreInSameTeam (Player[] playerList, String playername1, String playername2)
	{
		String a=findTeamName(playerList,playername1);
		String b=findTeamName(playerList,playername2);
		return a.equals(b);
		
	}

}




