import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		
		String sentence;
		int count =0;
		
		System.out.println("Take input string from user:");
		
		Scanner sc = new Scanner(System.in);
		
		sentence = sc.nextLine();
		
		for(int i=0;i<sentence.length();i++) {
			
			if(sentence.charAt(i)!=' ') {
				
				count++;
			}
		}
		
		System.out.println("The total characters in sentence are:"+count);

	}

}
