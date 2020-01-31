  public class TeamBO {
    public  Team createTeam(String data)
	{
		String a[]=data.split(",",5);
		Team t=new Team(a[0],a[1]);
		return t;
	}
	
	
	

}


