
package tugas4;

public class Employee {
    private String name;
    private int id;
    private String departemen;
    
    public Employee(String name, int id, String departemen){
        this.name  = name;
        this.id = id;
        this.departemen = departemen;
    }
    
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getDepartemen(){
        return departemen;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    
    public void displayInfo(){
        System.out.println("Name : "+ name);
        System.out.println("ID : "+ id);
        System.out.println("Departemen : "+ departemen);
    }
}
