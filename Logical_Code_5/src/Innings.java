class Innings
{
  private Long inningsNumber;
  private String battingTeam;

 Innings(){}
  Innings(Long inningsNumber,String battingTeam)
  {
   this.inningsNumber=inningsNumber;
   this.battingTeam=battingTeam;
  }

  void setInningsNumber(Long inningsNumber)
  {
   this.inningsNumber=inningsNumber;
  }
  Long getInningsNumber()
  {
   return inningsNumber;
  }

  void setBattingTeam(String battingTeam)
  {
   this.battingTeam=battingTeam;
  }
  String getBattingTeam()
  {
    return battingTeam;
  }
  
}

