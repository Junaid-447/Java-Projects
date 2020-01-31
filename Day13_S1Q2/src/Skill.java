class Skill
{

 String skillName;

 Skill(){}
 Skill(String skillName)
 {
  this.skillName=skillName;
 }

 public void setSkillName(String skillName)
 {
  this.skillName=skillName;
 }
 public String getSkillName()
 {
  return skillName;
 }
  public String toString()
 {
 return String.format("%-15s",skillName);
 }


}

