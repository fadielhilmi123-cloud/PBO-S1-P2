/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
    public class OperasiMatematika {
    public void tampilkan() {
        int x = 22;
        int y = 33;
        int penjumlahan = x + y;
        int pengurangan = x - y;
        int perkalian = x * y;
        double pembagian = (double) x / y;
        
        System.out.println("===========================");
        System.out.println("|   OPERASI MATEMATIKA    |");
        System.out.println("===========================");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("===========================");
        System.out.println("Penjumlahan = " + penjumlahan);
        System.out.println("Pengurangan = " + pengurangan);
        System.out.println("Perkalian = " + perkalian);
        System.out.println("Pembagian = " + pembagian);
        System.out.println("===========================");
    }
}

