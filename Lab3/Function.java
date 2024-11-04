package Lab3;

public class Function extends Instruction {
    private Program program;
    public Function(String w, Program p){
        super(w);
        program = p;
    }
    public Program getProgram(){
        return program;
    }
}
