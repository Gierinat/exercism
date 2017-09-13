public class PangramChecker {
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private char[] alphabetArray = alphabet.toCharArray();

    public boolean isPangram(String input) {
        
    	for (char c : alphabetArray) {
    		if (input.toLowerCase().indexOf(c) < 0) {
    			return false;
    		}
    	}
    	return true;
    }

}
