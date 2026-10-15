/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
public class PersamaanKuadrat {
    
    public void tampilkan() {
        int a = 2;
        int b = 10;
        int c = 5;
        int hasil = (b * b) - (4 * a * c);
        
        System.out.println("===========================");
        System.out.println("|     PERSAMAAN KUADRAT   |");
        System.out.println("===========================");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("b² - 4ac = " + hasil);
        System.out.println("===========================");
    }
}
