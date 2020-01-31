class PlayerBO
{

 
  void viewDetails(Player[] playerList)
  { 
   
     
     for(Player p:playerList)
     {
    	 System.out.println(p.toString());
     }
   }
  void printPlayerDetailsWithSkill(Player[] playerList, String skillName)
  {
   
  
    for(Player p:playerList)
    {
    	if(p.getSkill().skillName.equals(skillName))
    	{
    		System.out.println(p.toString());
    	}
    }

  }

}
