class Match
{
  String  date;
  String teamone;
  String teamtwo;
  String venue;
  Team team;

  Match(){}
  Match(String date,String teamone,String teamtwo,String venue,Team team)
  {
   this.date=date;
   this.teamone=teamone;
   this.teamtwo=teamtwo;
   this.team=team;
   this.venue=venue;
  }

  void setDate(String date)
  {
   this.date=date;
  }
  String getDate()
  {
    return date;
  }

  void setTeamone(String teamone)
  {
   this.teamone=teamone;
  }
  String getTeamone()
  {
    return teamone;
  }

  void setTeamtwo(String teamtwo)
  {
   this.teamtwo=teamtwo;
  }
  String getTeamtwo()
  {
    return teamtwo;
  }

  void setVenue(String venue)
  {
   this.venue=venue;
  }
  String getVenue()
  {
    return venue;
  }

  void setTeam(Team team)
  {
   this.team=team;
  }
  Team getTeam()
  {
    return team;
  }
 
  public String toString()
  {
 
   return String.format("%-15s %-15s %-15s %s",getDate(),getTeamone(),getTeamtwo(),getVenue());  
  }


}

