package Lab3;

public class Validator {
    //Attributes-----------------------
    Logo logo;

    //Methods------------------------------ 
    //Constructor
    public Validator(Logo l) {
        logo = l;
    }

    public int errorCode(Statement s) {
        if (logo.getInstruction(s.getWord()) == null) {
            return 1;
        }
        else if (logo.getInstruction(s.getWord()).isLegal(s.getParam())== false) {
            return 2;
        }
        return 0;
    }

    public void printError(Statement s) {
        switch(errorCode(s)) {
            case 0:
                System.out.println("Statement found in the dictionary with no errors");
                break;
            case 1:
                System.out.println("The 'word' variable of the statement is not valid: " + s.getWord() + " not found in dictionary");
                break;
            case 2:
                System.out.println("The parameter of the instruction is not valid: " + s.getParam() + " not within the legal range of: " + s.getWord());
                break;
        }
    }

    public int errorCode(Program p) {
        //For the entire program, check statements
        int end_count = 0;
        int rep_count = 0;

        for (int i = 0; i < p.getSize(); i++) {
            if (errorCode(p.getStatement(i)) != 0) { //If there's an error in the statement
                return -1;
            } 
        //For loops to be balanced, the amount of REP statements must be equal to the amount of END statements 
            if (p.getStatement(i).getWord().equals("END")){
                end_count++;
                if (end_count > rep_count) return 1; //There's been an END before a REP
            }
            if (p.getStatement(i).getWord().equals("REP")) rep_count++;
        }
        //Check for balance
        if (end_count == rep_count) return 0;
        else return 1;
    }

    public void printError(Program p) {
        switch (errorCode(p)) {
            case -1:
                System.out.println("The program contains an illegal statement");
                break;
            case 0:
                System.out.println("The program doesn't contain any errors");
                break;
            case 1:
                System.out.println("The program contains unbalaced loops");
                break;
        }
    }

}