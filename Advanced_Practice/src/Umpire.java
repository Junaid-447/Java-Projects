class Umpire
{
 String name;
 UmpireType umpireType;

 Umpire(){}
 Umpire(String name,UmpireType umpireType)
 {
   this.name=name;
   this.umpireType=umpireType;
 }

  void setName()
  {
   this.name=name;
  }
  String getName()
  {
    return name;
  }
  void setUmpireType(UmpireType umpireType)
  {
    this.umpireType=umpireType;
  }
  UmpireType getUmpireType()
  {
   return umpireType;
  }


}
