
public class Calculator {
public static void main(String[] args) {
/*	int n=657453;
	int sum = 0 ;
	int n1=n; 
	while(n>=10) {
	int a = 0 ; 
	sum = 0; 
	while(n!=0)
	{
	a = n%10; 
	sum+=a; 
	n=n/10;
	}
	n=sum;
}
	System.out.println(sum);

	String s="mama";
	
	
	StringBuffer sb=new StringBuffer(s);
	int l=sb.length();
	for(int i=0;i<l;i++)
	{
		int count=0;
		for(int j=i;j<l;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				sb.deleteCharAt(j);
				count++;
				j--;
				l--;
			}
			
		}
		if(count>0)
		{
			sb.deleteCharAt(i);
			i--;
			l--;
		}
	}
	if(sb.length()==0)
	{
		System.out.println(-1);
	}
	else
		System.out.println(sb);
			*/
		int a=2;
		int count=0,j=0; 
	int a1=a; 
	while(a1!=0) {

		count=count+1; 
		a1=a1/10;

		} 
	    int square=a*a; 
		String s=Integer.toString(square);

		String s1=s.substring(0,count); 
		String s2=s.substring(count); 
		int x=Integer.parseInt(s1); 
		int y=Integer.parseInt(s2); 
		int result =x+y; 
	

	System.out.println(result); }}

