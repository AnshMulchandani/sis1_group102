package Lab3;

public class TestLogo {
    public static void main(String[] args) {
     Program prog = new Program();
     Logo logo  = new Logo();
     Validator valid = new Validator(logo);
     prog.addStatement("PEN", 1);
     prog.addStatement("FWD", 200);
     prog.addStatement("REP", 10);
     prog.addStatement("END");
     prog.addStatement("REP", 10); //statement after END
     valid.printError(prog);
     Program prog2 = new Program();
     prog2.addStatement("PEN", 1);
     prog2.addStatement("FWD", 600); //problem out of range
     prog2.addStatement("REP", 10);
     prog2.addStatement("END");
    valid.printError(prog2);
    Program prog3 = new Program();
    prog3.addStatement("PEN", 1);
     prog3.addStatement("FWD", 400);
     prog3.addStatement("REP", 10);
     prog3.addStatement("END");
    valid.printError(prog3); //No problems
    }
}
