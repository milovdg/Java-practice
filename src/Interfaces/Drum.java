package Interfaces;

public class Drum implements Instrument {
    double size;

    @Override
    public void play() {
        System.out.println("Playing drums...");
    }

//constructor
    public Drum(double dSize){
        size = dSize;
    }

//getter
    public double getParameter() {
        return size;
    }
}
