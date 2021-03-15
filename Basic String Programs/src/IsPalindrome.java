
public class IsPalindrome {

	public static void main(String[] args) {
		
		if(isPlaindrome()) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		}

	public static boolean isPlaindrome() {
		
		String s = "Red rum sir is murder";
		s = s.toLowerCase();
		int i = 0;
		int j = s.length()-1;
		
		boolean isPal = false;
		
		while(i<j) {
			while(!((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')))
				i++;
			while(!((s.charAt(j)>='a' && s.charAt(j)<='z') || (s.charAt(j)>='0' && s.charAt(j)<='9')))
				j--;
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
