package Interfaces;

public class playInstruments {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];

        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(123);
        Trumpet trumpet = new Trumpet(12.3);

        instruments[0] = guitar;
        instruments[1] = drum;
        instruments[2] = trumpet;

        for (int i = 0; i < instruments.length; i++){
            System.out.println("=========================");
            instruments[i].play();
            System.out.println("Local parameter: " + instruments[i].getParameter());

        }

/*        guitar.play();
        System.out.println("Local parameter: " + guitar.getParameter());
        trumpet.play();
        System.out.println("Local parameter: " + trumpet.getParameter());
*/

    }

}
