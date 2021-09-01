package Interfaces;

public class Trumpet implements Instrument {
    double diameter;

    @Override
    public void play() {
        System.out.println("Playing trumpet...");
    }

//constructor
    public Trumpet(double dDiameter){
        diameter = dDiameter;
    }

//getter
    public double getParameter() {
        return diameter;
    }
}
