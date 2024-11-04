package Lab3;
import java.util.ArrayList;
public class Program{
    //Arraylist
    private ArrayList<Statement> body;
    //Constructor
    public Program(){
        body = new ArrayList<Statement>();
    }
    //Methods
    public void addStatement(String w, int p){
        Statement state  = new Statement(w, p); //create an statement with the given values 
        body.add(state); //add the created statement in dictionary
    }
    public void addStatement(String w){
        Statement state_0 = new Statement(w); 
        body.add(state_0);
    }
    public int getSize(){
        return body.size(); //return size of arraylist
    }
    public Statement getStatement(int line){
        return body.get(line); //get a statement with the index
    }
}