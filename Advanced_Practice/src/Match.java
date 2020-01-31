class Match
{

 String date;
 String teamone;
 String teamtwo;
 Umpire umpire;

 Match(){}
 Match(String date,String teamone,String teamtwo,Umpire umpire)
 {
  this.date = date;
  this.teamone = teamone;
  this.teamtwo = teamtwo;
  this.umpire = umpire;

 }

 void setDate()
 {
  this.date = date;
 }
 String getDate()
 {
  return date;
 }
 
 void setTeamone(String teamone)
 {
  this.teamone = teamone;
 }
 String getTeamone()
 {
  return teamone;
 }
 void setTeamtwo(String teamtwo)
 {
  this.teamtwo = teamtwo;
 }
 String getTeamtwo()
 {
  return teamtwo;
 }

 void setUmpire(Umpire umpire) 
 {
  this.umpire = umpire;
 }
 Umpire getUmpire()
 {
  return umpire;
 }

 public String toString()
 {
    return String.format("%-15s %-15s %-15s",getDate(),getTeamone(),getTeamtwo()); 
   
 }

}

