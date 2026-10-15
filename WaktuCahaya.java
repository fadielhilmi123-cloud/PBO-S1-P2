/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
public class WaktuCahaya {
    public void tampilkan() {
        double jarakBulan = 384400;
        double jarakMatahari = 152100000;
        double kecepatanCahaya = 300000;
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("==============================================");
        System.out.println("|                 WAKTU CAHAYA               |");
        System.out.println("==============================================");
        System.out.println("Waktu cahaya ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu cahaya ke Matahari = " + waktuMatahari + " detik");
        System.out.println("Waktu cahaya ke Bulan = " + (waktuBulan / 60) + " menit");
        System.out.println("Waktu cahaya ke Matahari = " + (waktuMatahari / 60) + " menit");
        System.out.println("==============================================");
    }
}