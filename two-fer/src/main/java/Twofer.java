public class Twofer {
    public String twofer(String name) {
    	
    	String str = name == null ? "you" : name;
    	return "One for " + str + ", one for me.";

    }
}