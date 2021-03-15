import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		String sentence;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input from the user:");
		
		sentence = sc.nextLine();
		
		char vowelArr [] = new char[] {'a','e','i','o','u'};
		
		int vowelCount = 0, consonantCount=0;
		int temp = 0;
		
		for(int i=0;i<sentence.length();i++) {
			
			for(int j=0; j<vowelArr.length; j++) {
				
				
				if(sentence.charAt(i)==vowelArr[j]) {
					
					vowelCount++;
				}
				
			}
			
			if(vowelCount == temp) {
				consonantCount++;
			}
		}
		System.out.println();
		System.out.println("Number of vowels in the sentence are:"+vowelCount);
		System.out.println("Number of Consonant are:"+(sentence.length()-vowelCount));
	}

}
