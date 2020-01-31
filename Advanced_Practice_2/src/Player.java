class Player
{
  private String  name;
  private String country;
  private String skill;

  Player(){}
  Player(String name,String country,String skill)
  {
    this.name=name;
    this.country=country;
    this.skill=skill;
  }

  void setName(String name)
  {
   this.name=name;
  }
  String getName()
  {
    return name;
  }

  void setCountry(String country)
  {
   this.country=country;
  }
  String getCountry()
  {
    return country;
  }

  void setSkill(String skill)
  {
   this.skill=skill;
  }
  String getSkill()
  {
    return skill;
  }



}
