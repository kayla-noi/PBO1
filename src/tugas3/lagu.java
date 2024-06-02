/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
public class lagu {
    private String judul;
    private String penyanyi;
    private String pencipta;
    
    //method constructor 
    public lagu() {}
    
    //method mutator
    public void setJudul (String judul){
        this.judul = judul;
    }
    
    public void setPenyanyi (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void setPencipta (String pencipta) {
        this.pencipta = pencipta;
    }
    
    //method accessor
    public String getJudul(){
        return judul;
    }
    
    public String getPenyanyi(){
        return penyanyi;
    }
    
    public String getPencipta(){
        return pencipta;
    }
}
