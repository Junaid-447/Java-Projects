import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
 public static void main(String args[]) throws IOException{

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  Integer umpireTypeCount,umpireCount,matchCount,i,choice;
  String umpireType,umpire,match,matchDate,ch,umpireName;
  System.out.println("Enter the umpire type count");
  umpireTypeCount=Integer.parseInt(br.readLine());
  UmpireType[]  umpireTypeList= new UmpireType[umpireTypeCount];
  UmpireTypeBO  umpireTypeBO = new UmpireTypeBO();

   for(i=0;i<umpireTypeCount;i++)
   {
   System.out.println("Enter umpire type "+(i+1)+" details");
   umpireType=br.readLine();
   umpireTypeList[i] =umpireTypeBO.createUmpireType(umpireType); 

   }

  System.out.println("Enter the umpire count");
  umpireCount=Integer.parseInt(br.readLine());
  Umpire[]  umpireList= new Umpire[umpireCount];
  UmpireBO umpireBO = new UmpireBO();

   for(i=0;i<umpireCount;i++)
   {
   System.out.println("Enter umpire "+(i+1)+" details");
   umpire=br.readLine();
   umpireList[i]=umpireBO.createUmpire(umpire,umpireTypeList);
   }
  
   System.out.println("Enter the match count");
   matchCount=Integer.parseInt(br.readLine());
   Match[] matchList= new Match[matchCount];
   MatchBO matchBO=new MatchBO();
   for(i=0;i<matchCount;i++)
   {
    System.out.println("Enter match "+(i+1)+" details");
    match=br.readLine();
    matchList[i] =matchBO.createMatch(match,umpireList);
   }
   Match m=null;
   do{
       System.out.println("Menu :");
       System.out.println("1)Find Umpire");
       System.out.println("2)Find All Matches In A Specific Venue");
       System.out.println("Type 1 or 2 ");
       System.out.println("Enter your choice");
       choice=Integer.parseInt(br.readLine());
       
       if(choice==1)
       {
        System.out.println("Enter Match date");
        matchDate=br.readLine();
        System.out.println("Umpire");
        m= matchBO.findUmpire(matchDate,matchList);
        System.out.println(m.getUmpire().getName());
       }
       else if(choice==2)
       {
        System.out.println("Enter Umpire Name");
        umpireName=br.readLine();
        System.out.println("Match Details:");
         System.out.format("%-15s %-15s %-15s\n","Date","TeamOne","TeamTwo");
       
        matchBO.findAllMatchesOfGivenUmpire(umpireName,matchList);
       }


       System.out.println("Do you want to continue? Type Yes or No");
       ch=br.readLine();
       
   }while(ch.equals("Yes"));
 
 }
}
