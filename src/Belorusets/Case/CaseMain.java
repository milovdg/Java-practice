package Belorusets.Case;

public class CaseMain {
    public static void main(String[] args) {
        int x = 4;

        System.out.println("==========The new style============");

        switch (x){
            case 0 -> System.out.println("Nothing is in there");
            case 1, 2 -> System.out.println("Just a little bit");
            case 3, 4 -> System.out.println("Something is in there");
            default -> System.out.println("Default value");
        }

        System.out.println("==========The old style============");

        switch (x){
            case 0:
                System.out.println("Nothing is in there");
                break;
            case 1:
            case 2:
                System.out.println("Just a little bit");
                break;
            case 3:
            case 4:
                System.out.println("Something is in there");
            default:
                System.out.println("Default value");
        }
    }
}
