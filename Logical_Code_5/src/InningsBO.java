import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InningsBO {
	 
   public  Innings createInnings(String data) {
	Long e;
    String a[]=data.split(",");
    
    e=Long.parseLong(a[0]);
    Innings i=new Innings(e,a[1]);
    return i;

    }

}
