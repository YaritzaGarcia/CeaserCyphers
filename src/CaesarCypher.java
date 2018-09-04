
public class CaesarCypher {
	
	private int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0,key);
		String rightSubString = alphabet.substring(key);
		shiftedAlphabet = rightSubString + leftSubstring;
	}
	public String encode(String clearText) {
		String cypherText = "";
		for(int i=0; i<clearText.length(); i++) {
			cypherText += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return cypherText;
	}
}
