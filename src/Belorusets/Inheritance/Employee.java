package Belorusets.Inheritance;

public class Employee extends Person{

    private double salary;
    private String company;

    Employee(String sName, double dSalary, String sCompany)
    {
        super(sName);
        salary = dSalary;
        company = sCompany;
    }

    public double getSalary() {
        return salary;
    }
    public String getCompany() {
        return company;
    }

}
