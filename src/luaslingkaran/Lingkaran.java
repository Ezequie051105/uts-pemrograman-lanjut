/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaslingkaran;

/**
 *
 * @author USER
 */
public class Lingkaran {
    final double PI = 3.141592;
    
    void hitungLuas(double r){
        double hasil = PI * r * r;
        System.out.println("Hasil bilangan pecahan : " + hasil);
        System.out.println("Hasil bilangan bulat : " + (int)hasil);
        System.out.println("Hasil bilangan pembulatan : " + Math.round(hasil));
    }
    
}
