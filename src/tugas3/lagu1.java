/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
public class lagu1 {
    
    public static void main(String[] args){
        lagu lagu1 = new lagu();
        
        lagu1.setJudul("Asing");
        lagu1.setPenyanyi("Juicy Lucy");
        lagu1.setPencipta("Denis Ligia dan Iqbal Siregar");
        
        
        System.out.println("Judul lagu  :"+lagu1.getJudul());
        System.out.println("Penyanyi    :"+lagu1.getPenyanyi());
        System.out.println("Pencipta    :"+lagu1.getPencipta());
    }
}
