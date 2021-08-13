package Interfaces;

public class playInstruments {

    public static void main(String[] args) {

        Guitar guitar = new Guitar(6);
        guitar.play();
        System.out.println("Local parameter: " + guitar.getParameter());

    }

}
