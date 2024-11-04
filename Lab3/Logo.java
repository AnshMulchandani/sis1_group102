package Lab3;
import java.util.*;


public class Logo{
    //attributes
    private Turtle turtle;
    private Map<String, Instruction> ins;
    //Methods
    public Logo(){
        //Iniciate turtle
        turtle = new Turtle();
        //Iniciate dictionary
        ins = new HashMap<String, Instruction>();
        Instruction pen = new Instruction("PEN", 0, 1);
        ins.put("PEN", pen);
        Instruction fwd = new Instruction("FWD", 1, 500);
        ins.put("FWD", fwd);
        Instruction rot = new Instruction("ROT", 1, 360);
        ins.put("ROT", rot);
        Instruction rep = new Instruction("REP", 1, 100);
        ins.put("REP", rep);
        Instruction end = new Instruction("END");
        ins.put("END", end);
    }
    public Instruction getInstruction(String name){
        return ins.get(name);
    }
    public void addFunction(String n, Program p){
        Function f = new Function(n, p); //creates a new instance of function
        ins.put(n, f); //add this funtion with is name in the dictionary
    }
}