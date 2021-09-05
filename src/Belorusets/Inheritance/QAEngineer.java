package Belorusets.Inheritance;

public class QAEngineer extends Employee{

    private double bonus;

    QAEngineer(String sName, double dSalary, String sCompany, double dBonus)
    {
        super(sName, dSalary, sCompany);
        bonus = dBonus;
    }

    public double getBonus() {
        return bonus;
    }

}
