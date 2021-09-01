package Interfaces;

public class Guitar implements Instrument{
    private Integer stringsNumber;

    @Override
    public void play() {
        System.out.println("Playing guitar... " + "NO " + KEY);
    }

//constructor
    public Guitar(Integer iStringsNumber) {
        stringsNumber = iStringsNumber;
    }

 //getter

    public double getParameter() {
        return stringsNumber;
    }

}
