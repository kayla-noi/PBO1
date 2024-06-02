package employeemanagement;

public class Main {
    public static void main(String[] args){
        Manager manager=new Manager("Alyysa theoryma",101, 75000, 1500);
        manager.displayInfo();
        
        Developer developer=new Developer("bobby rajendra",102,55000,"Java");
        developer.displayInfo();
    }
}
