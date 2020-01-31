import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class Main{
   public static boolean validateDate(String strDate)
   {
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	else
	{
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
	    sdfrmt.setLenient(false); 
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println("Valid");
	    }
	    catch (ParseException e)
	    {
	        System.out.println("Invalid");
	        return false;
	    }
	    return true;
	}
   }
   public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   String a=sc.nextLine();
	   validateDate(a);
   }
}