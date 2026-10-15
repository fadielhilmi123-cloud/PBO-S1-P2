/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
public class SegitigaPhytagoras {
    public void tampilkan() {
        double a = 6;
        double b = 8;
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("==================================");
        System.out.println("|        KELILING SEGITIGA       |");
        System.out.println("==================================");
        System.out.println("Sisi a = " + a);
        System.out.println("Sisi b = " + b);
        System.out.println("Sisi c = " + c);
        System.out.println("Keliling segitiga = " + keliling);
        System.out.println("==================================");

    }
}