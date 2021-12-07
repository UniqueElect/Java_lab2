package Task1;

public abstract class Figure {

     public final double pi = 3.1415; // constanta 4yslo pi
     protected String colour = "white";
     public abstract double findPerimetr();

    public abstract double findArea();

    public void setColour(String colour){
        this.colour = colour;
    }
    public abstract String toString();

    Figure(){
    }
}
