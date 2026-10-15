/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {
    public void tampilkan() {

        double C = 10;
        double F = 15;
        double R = 5;
        double cToF = (9.0 / 5.0 * C) + 32;
        double fToC = 5.0 / 9.0 * (F - 32);
        double cToR = 4.0 / 5.0 * C;
        double rToC = 5.0 / 4.0 * R;
        double fToR = 4.0 / 9.0 * (F - 32);
        double rToF = 9.0 / 4.0 * R + 32;

        System.out.println("==============================================");
        System.out.println("|              KONVERSI SUHU                 |");
        System.out.println("==============================================");
        System.out.println("=== Celsius ke Fahrenheit ===");
        System.out.println(C + " C = " + cToF + " F");
        System.out.println("==============================================");
        System.out.println("\n=== Fahrenheit ke Celsius ===");
        System.out.println(F + " F = " + fToC + " C");
        System.out.println("==============================================");
        System.out.println("\n=== Celsius ke Reamur ===");
        System.out.println(C + " C = " + cToR + " R");
        System.out.println("==============================================");
        System.out.println("\n=== Reamur ke Celsius ===");
        System.out.println(R + " R = " + rToC + " C");
        System.out.println("==============================================");
        System.out.println("\n=== Fahrenheit ke Reamur ===");
        System.out.println(F + " F = " + fToR + " R");
        System.out.println("==============================================");
        System.out.println("\n=== Reamur ke Fahrenheit ===");
        System.out.println(R + " R = " + rToF + " F");
        System.out.println("==============================================");

    }
}
