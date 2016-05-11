import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Responder {
	
	HashMap<String, String>  mymap = new HashMap<String, String>();
	
	public void fillmymap(){
		
		mymap.put("crashed","maybe try restarting the computer?");
		mymap.put("slow", "you got a slow ass computer");
		mymap.put("help", "Tell me whats wrong and im sure i can help");
		mymap.put("fire", "Maybe put the fire out before writing to us");
		mymap.put("problem", "What seems to be the problem?");
		mymap.put("internet", "Are your DSL Settings correct?");
		mymap.put("connection", "How about restarting your router?");
		mymap.put("usb", "Maybe your connector or cable is not working correctly");
		mymap.put("power", "Are all the cables connected?");
		mymap.put("password", "Have you tried resetting your password");
		mymap.put("hello", "Hello there, how can i help?");
		
	}
	
	public String generateResponse(HashSet<String> words){
		
		Iterator<String> iterator = words.iterator();
		
		while(iterator.hasNext()){
			
			String word = iterator.next();
			String response = mymap.get(word);
			if (response != null) return response;
		}
		
		return "I didn't understand the question";
	}

}
