package EmployeeSalaryProtection;

public class Employee {
    private double salary;

    public void setSalary(double s){
        if(s>=10000){
            salary=s;
        }
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setSalary(100000);
        System.out.println(e.getSalary());
    }
}
