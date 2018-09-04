
public class Main {

	public static void main(String[] args) {
		
		CaesarCypher c = new CaesarCypher(3);
		
		String clear = "HELLO"; 
		
		String cyphered = c.encode(clear);
		
		String correct = "KHOOR";
		
		System.out.println(cyphered);
	
	}
}
