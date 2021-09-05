package Belorusets.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        QAEngineer qaEngineer = new QAEngineer("Dmitry Milov", 100000.00, "Microsoft", 20000.00);

        System.out.println(qaEngineer.getName() + " " + qaEngineer.getSalary() + " " + qaEngineer.getCompany() + " " + qaEngineer.getBonus());

    }
}
