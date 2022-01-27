package Emploice;

public class Employees
{
    String lastName;
    String firstName;
    double hourlyWage;
    int yearsWithCompany;
    public Employees()
    {

    }
    public Employees(int years)
    {
        this.yearsWithCompany = years;
    }
    @Override
    public String toString()
    {
        return "First Name: " +  firstName + "\nLast name: " +  lastName + "\nHourly wage: " + hourlyWage + "\nYears with company: " + yearsWithCompany;
    }
    public int getYears()
    {
        return yearsWithCompany;
    }
}
