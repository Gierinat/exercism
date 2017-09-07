class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] charArray = dnaStrand.toCharArray();
        StringBuilder strb = new StringBuilder();
        
        for(char c : charArray) {
        	c = c == 'G' ? 'C' : 
        		c == 'C' ? 'G' :
        		c == 'T' ? 'A' :	
        		c == 'A' ? 'U' : 'X';
        	strb = strb.append(c);
        }
        
        return strb.toString();
        
        
    }

}
