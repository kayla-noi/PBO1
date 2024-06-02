package tugas4;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    
    public PartTimeEmployee(String name, int id, String departemen, double hourlyRate){
        super(name, id, departemen);
        this.hourlyRate = hourlyRate;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Hourly Rate: "+ hourlyRate);
    }
    
}
