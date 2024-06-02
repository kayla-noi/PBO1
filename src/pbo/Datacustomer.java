/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author LENOVO
 */
public class Datacustomer {
    public static void main(String[] args){
        customer customerpertama = new customer();
        customer customerkedua   = new customer();
        
        customerpertama.Nama = "Rania";
        customerpertama.Alamat = "Banjarbaru";
        customerpertama.Umur = 22
        
        customerkedua.Nama = "Kayla";
        customerkedua.Alamat = "Banjarmasin";
        customerkedua.Umur = 27
        
        System.out.println("Nama    :"+customerpertama.Nama);
        System.out.println("Alamat  :"+customerpertama.Alamat);
        System.out.println("Umur    :"+customerpertama.Umur);
        System.out.println("");
        
        System.out.println("Nama    :"+customerkedua.Nama);
        System.out.println("Alamat  :"+customerkedua.Alamat);
        System.out.println("Umur    :"+customerkedua.Umur);
        
    }
}
