
public class BinaryAddition {

	public static void main(String[] args) {
		
		String a = "101";
		String b = "10";
		
		StringBuilder sb = new StringBuilder();
		
		int carry = 0;
		int i = a.length()-1;
		int j = b.length()-1;
		
		while(i>=0 || j>=0) {
			
			int sum = 0;
			
			if(i>=0 && a.charAt(i)=='1')
				sum++;
			if(j>=0 && b.charAt(j)=='1')
				sum++;
			
			sum = sum + carry;
			
			if(sum>=2)
				carry = 1;
			else
				carry = 0;
			
			sb.insert(0, (char)((sum%2)+'0'));
			
			i--;
			j--;
		}
		
		if(carry==1)
			sb.insert(0, '1');
		
		System.out.println(sb.toString());
	}

}
