import java.util.HashSet;

public class SupportLine {
	
	public static void main (String[] args){
	
		InputReader input = new InputReader();
		Responder responder = new Responder();
		HashSet<String> words = new HashSet<String>();
		words = input.readinput();
		responder.fillmymap();
		
		while(!words.contains("bye")){
	
			String answer = responder.generateResponse(words); 
			System.out.println(answer);
			words = input.readinput();
			
		}	
	}
	
}
