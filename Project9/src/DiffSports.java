

interface Sports
{
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);
}
interface Football extends Sports
{
	public void HomeTeamScored(int points);
	public void VisitingTeamScored(int points);
	public void EndofQuarter(int quarter);
}
interface Hockey extends Sports
{
	public void HomeGoalScored();
	public void VisitingGoalScored();
	public void EndofPeriod(int period);
	public void OvertimePeriod(int ot);
}
public class DiffSports implements Sports,Football,Hockey {
	void SetHomeTeam(String n)
	{
		System.out.println("Home team:"+n);
	}
	public void setVisitingTeam(String m)
	{
		System.out.println("Away team:"+m);
	}
	public void HomeTeamScored(int x)
	{
		System.out.println("Points scored by home team are:"+x);
	}
	public void VisitingTeamScored(int y)
	{
		System.out.println("Points scored by viviting team are:"+y);
		
	}
	public void EndofQuarter(int z) {
		System.out.println("Quarter time is:"+z);
	}
	public void HomeGoalScored()
	{
		System.out.println("Home team scores a goal");
	}
	public void VisitingGoalScored()
	{
		System.out.println("Visiting team scores a goal");
	}
	public void EndofPeriod(int v)
	{
		System.out.println("End time is:"+v);
	}
	public void OvertimePeriod(int w)
	{
		System.out.println("Overtime is:"+w);
	}
	public static void main(String a[])
	{
		Football f1=new DiffSports();
	    Hockey h1=new DiffSports();
	    Sports s1=new DiffSports();
	    s1.setHomeTeam("Chelsea");
	    s1.setVisitingTeam("Manu");
	    f1.HomeTeamScored(3);
	    f1.VisitingTeamScored(0);
	    f1.EndofQuarter(45);
	    h1.HomeGoalScored();
	    h1.VisitingGoalScored();
	    h1.EndofPeriod(90);
	    h1.OvertimePeriod(120);
	    
	}
	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		
	}
	
	}


