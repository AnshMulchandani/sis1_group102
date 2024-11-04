package Lab3;
public class Turtle{
    //Atributes
    private int pen;
    private int xpos;
    private int ypos;
    private int angle;
    //Constructor
    public Turtle(){
        pen = 1;
        xpos = 0;
        ypos = 0;
        angle = 0;
    }
    //Getters
    public int getPen(){
        return pen;
    }
    public int getXpos(){
        return xpos;
    }
    public int getYpos(){
        return ypos;
    }
    public int getAngle(){
        return angle;
    }
    //Setters
    public void setPen(int pen_value){
        if(pen_value == 0 || pen_value == 1){
            pen = pen_value;
        }
        else{
            System.out.println("This value of the pen is not posible, remember pen value only can be [0,1]");
        }
    }
    public void moveFwd(int distance){
        double radiants = Math.toRadians(angle); //since the angle has to be in radiants
        double distance_value = (double) distance; //we transform the distance to a real since we have to multiply with a real
        //Trigonometrical identity 
        double x_value = distance_value*Math.cos(radiants); 
        double y_value = distance_value*Math.sin(radiants);
        xpos = (int) x_value; //transform this value in integer
        ypos = (int) y_value;
        
    }
    public void rotate(int degrees){ 
            angle += degrees; //we sum the degree value to the angle of the class
            if(angle >= 360){ //if the angle is greater or equal to 360 then we make the modulus of 360
                angle = angle % 360; 
            }
    }
    public String toString(){
        //print the string representation
        return ("\n"+"PEN VALUE: " + pen+"\n" 
                +"X POSITION: " + xpos+"\n"
                +"Y POSITION: "+ ypos+"\n"
                +"ANGLE: "+ angle + "\n" );
    }


}
