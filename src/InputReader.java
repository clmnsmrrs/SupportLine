import java.util.HashSet;
import java.util.*;

public class InputReader {
	
	Scanner sc = new Scanner(System.in);
	
	public HashSet<String> readinput(){
		String question = sc.nextLine().trim().toLowerCase();
		String[] inputwords = question.split(" ");
		
		HashSet<String> words = new HashSet<String>();
		for(String word : inputwords){
			
			words.add(word);
		}
		
		return words;
	}
	
}
