import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DeliveryBO
{
  
     public Delivery createDelivery(String data,Innings[] inningsList) {
    	 Delivery d = null;
         long e=0,f=0,g=0;
         String b[]=data.split(","); 
         e=Long.parseLong(b[0]);
         f=Long.parseLong(b[3]);
         g=Long.parseLong(b[4]);
         
         for(Innings i:inningsList)
         if(i.getInningsNumber().equals(g))
         {
        	 d= new Delivery(e,b[1],b[2],f,i);
         }
 return d;
      }


 public Long findInningsNumber(Delivery [] deliveryList, long deliveryNumber)

  {
	 long h=0;

       for(Delivery d:deliveryList)
       {
    	   if(d.getDeliveryNumber()==deliveryNumber)
    	   {
    		  h=d.getInnings().getInningsNumber(); 
    	   }
       }
       return h;

 }
}
