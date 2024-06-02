package tugas4;

public class FullTimeEmployee extends Employee{
    private double salary;
    
    public FullTimeEmployee(String name, int id, String departemen, double salary){
        super(name, id, departemen);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Salary: "+ salary);
    }
}
