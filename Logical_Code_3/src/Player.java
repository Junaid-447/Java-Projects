class Player
{
 private String name;
 private String country;
 private Skill skill;
 
 Player(){}
 Player(String name,String country,Skill skill)
 {
  this.name=name;
  this.country=country;
  this.skill=skill;
 }



 public void setName()
 {
  this.name=name;
 }
 public String Name(String name)
 {
  return name;
 }

 public void setCountry(String country)
 {
  this.country=country;
 }
 public String getCountry()
 {
  return country;
 }
 
 public void setSkill(Skill skill)
 {
  this.skill=skill;
 }
 public Skill getSkill()
 {
  return skill;
 }
 
 public String toString()
 {
  return String.format("%-15s %-15s %-15s",name,country,skill);
 }


}
