package Belorusets.Monkey;

public class MonkeyMain {
    public static void main(String[] args) {

        Monkey monkey = new Monkey();

        System.out.println(monkey.monkeyTrouble(false, false));
        System.out.println(monkey.monkeyTrouble(false, true));
        System.out.println(monkey.monkeyTrouble(true, false));
        System.out.println(monkey.monkeyTrouble(true, true));

    }
}
