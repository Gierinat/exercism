class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] charArray = dnaStrand.toCharArray();
        StringBuilder strb = new StringBuilder();
        
        for(char c : charArray) {
        	c = c == 'G' ? 'C' : 
        		c == 'C' ? 'G' :
        		c == 'T' ? 'A' :	
        		c == 'A' ? 'U' : 'E';
        	if (c == 'E') {
        		throw new IllegalArgumentException("Invalid input");
        	} else {
        		strb = strb.append(c);
        	}
        	
        }
        
        return strb.toString();
        
        
    }

}
