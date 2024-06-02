package tugas4;

public class Main {
    public static void main(String[] args){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee ("Riana",101,"Engineering",50000.0);
        fullTimeEmployee.displayInfo();
        
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee ("Karlina",102,"Engineering",50000.0);
        partTimeEmployee.displayInfo();
        
        Employee employee1 = fullTimeEmployee;
        Employee employee2 = partTimeEmployee;
        
        System.out.println("\nPolymorphism Example: ");
        employee1.displayInfo();
        employee2.displayInfo();
    }
    
}
