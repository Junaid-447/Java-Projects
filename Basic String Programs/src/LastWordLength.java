
public class LastWordLength {

	public static void main(String[] args) {
		
		String sentence = "My name is Max";
		
		int len = sentence.length();
		int count = 0;
		
		for(int i=len-1;i>0;i--) {
			
			if(sentence.charAt(i)!=' ') {
				count++;
			}
			else if(sentence.charAt(i)==' ') {
				break;
			}
		}
		System.out.println("Length of the last word is: "+count);

	}

}
