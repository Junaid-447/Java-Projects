import java.util.Scanner;

public class Main {
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	Histogram h=new Histogram();
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int m=sc.nextInt();
		h.addScore(m);
	}
	System.out.println("Histogram");
	h.displayHistogram();
}
}
