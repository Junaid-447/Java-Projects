import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
 public static void main(String args[]) throws IOException{

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Integer numberOfInnings,numberOfDeliveries,i;
 

  System.out.println("Enter the number of innings"); 
  numberOfInnings=Integer.parseInt(br.readLine());

  Innings inningsList[]=new Innings[numberOfInnings];
  InningsBO inningsBo=new InningsBO();
  for(i=0;i<numberOfInnings;i++)
  {
   System.out.println("Enter innings "+(i+1)+" details");
   String inningDetail=br.readLine();
   inningsList[i]=inningsBo.createInnings(inningDetail);

  }
 
  
   
  System.out.println("Enter the number of deliveries"); 
  numberOfDeliveries=Integer.parseInt(br.readLine());

  Delivery deliveryList[] = new Delivery[numberOfDeliveries];
  DeliveryBO deliveryBo=new DeliveryBO();

  for(i=0;i<numberOfDeliveries;i++)
  {
   System.out.println("Enter innings "+(i+1)+" details");
   String deliveryDetail=br.readLine();
   deliveryList[i]=deliveryBo.createDelivery(deliveryDetail,inningsList);
  }
  System.out.println("Enter the delivery number for which you need to find the innings number");
  Long deliveryNumber=Long.parseLong(br.readLine());
  System.out.println("Innings : "+deliveryBo.findInningsNumber(deliveryList,deliveryNumber));
 }
}
