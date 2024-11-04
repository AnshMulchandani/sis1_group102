package Lab3;

public class Statement {
    //Atributes
    private String word;
    private int param;

    //Methods
    //Constructor
    public Statement(String w, int i) {
        word = w;
        param = i;
    }
    public Statement(String w) {
        word = w;
    }

    public String getWord() {
        return word;
    }

    public int getParam() {
        return param;
    }

    public String toString() {
            return word + ":" + param;
    }
}