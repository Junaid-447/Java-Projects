class Delivery
{
  private Long deliveryNumber;
  private String batsman;
  private String bowler;
  private Long runs;
  private Innings innings;

  Delivery() {}
  Delivery(Long deliveryNumber,String batsman,String bowler,Long runs,Innings innings)
  {
   this.deliveryNumber=deliveryNumber;
   this.batsman=batsman;
   this.bowler=bowler;
   this.runs=runs;
   this.innings=innings;
   }




  void setDeliveryNumber(Long deliveryNumber)
  {
   this.deliveryNumber=deliveryNumber;
  }
  Long getDeliveryNumber()
  {
   return deliveryNumber;
  }

  void setBatsman(String batsman)
  {
   this.batsman=batsman;
  } 
  String getBatsman()
  {
    return batsman;
  }
 
  void setBowler(String bowler)
  {
   this.bowler=bowler;
  }
  String getBowler()
  {
   return bowler;
  }

  void setRuns(Long runs)
  {
   this.runs=runs;
  }
  Long getRuns()
  {
   return runs;
  }
  
  void setInnings(Innings innings)
  {
   this.innings=innings;
  }
  Innings getInnings()
  {
   return innings;
  } 


}
