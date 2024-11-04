package Lab3;

public class Instruction {
    //Attributes
    private String word;
    private int lowerBound;
    private int upperBound;

    //Methods 
    public Instruction(String w, int lb, int ub) {
        word = w;
        lowerBound = lb;
        upperBound = ub;
    }

    public Instruction(String w) { //For instruction that don't have boundaries on values
        word = w;
        lowerBound = Integer.MIN_VALUE;
        upperBound = Integer.MAX_VALUE;
    }

    public String getWord() { //Gets the name of the instruction
        return word;
    }

    public boolean isLegal(int p) { //Returns whether or not the value is within the range
        if (p >= lowerBound && p <= upperBound) return true;
        return false; //Return false if not bigger or lower 
    }

    public String toString() {
        return (word + "[" + lowerBound + ", " + upperBound + "]");
    }

}
