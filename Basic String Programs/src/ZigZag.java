
public class ZigZag {

	public static void main(String[] args) {
		
		String s = "THISISMYNEWCODE";
		
		int k = 3;
		
		StringBuilder sb = new StringBuilder();
		
		int step = 2 * k - 2;
		
		for(int i=0;i<s.length();i++) {
			
			if(i==0 || i==s.length()-1) {
				
				for(int j=i;j<s.length();j++) {
					
					sb.append(s.charAt(j));
					
				}
			}else {
				int j = i;
				boolean flag = true;
				int step1 = 2 * (k -1 -i);
				int step2 = step - step1;
				
			}
		}

	}

}
