class Team
{
   String  name;
   Player  player;

  Team(){}
  Team(String name,Player player)
  {
    this.name=name;
    this.player=player;
  }

  void setName(String name)
  {
   this.name=name;
  }
  String getName()
  {
    return name;
  }

  void setPlayer(Player player)
  {
   this.player=player;
  }
  Player getPlayer()
  {
    return player;
  }


}
