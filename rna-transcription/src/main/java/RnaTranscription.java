import java.util.Arrays;
import java.util.stream.Collectors;

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
        
        
//        String[] letters = {"A","T","G"};
//       return Arrays.stream(letters).map(this::translate).collect(Collectors.joining(","));
        
        
    }
    
//    private String translate(String s) {
//        switch (s) {
//            case "C":
//                return "G";
//            case "T":
//                return "A";
//            case "A":
//                return "U";
//            case "G":
//                return "C";
//            default:
//                throw new IllegalArgumentException("Invalid input");
//        }
//    }

}
