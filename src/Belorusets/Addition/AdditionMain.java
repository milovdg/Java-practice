package Belorusets.Addition;

public class AdditionMain {

    public static void main(String[] args) {
        Addition addition = new Addition();

        System.out.println(addition.sum(2,2));
        System.out.println(addition.sum(2,2, 2));
        System.out.println(addition.sum(2.22,2.22));

    }
}
