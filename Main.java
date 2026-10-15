/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        IlustrasiIncrement i = new IlustrasiIncrement();
        PersamaanKuadrat pk = new PersamaanKuadrat();
        OperasiMatematika op = new OperasiMatematika();
        Segitiga s = new Segitiga();
        SegitigaPhytagoras sp = new SegitigaPhytagoras();
        UbahString ub = new UbahString();
        WaktuCahaya w = new WaktuCahaya();
        KonversiSuhu k = new KonversiSuhu();
                
        i.tampilkan();
        System.out.println("");
        p.tampilkan();
        System.out.println("");
        pk.tampilkan();
        System.out.println("");
        op.tampilkan();
        System.out.println("");
        s.tampilkan();
        System.out.println("");
        sp.tampilkan();
        System.out.println("");
        ub.tampilkan();
        System.out.println("");
        w.tampilkan();
        System.out.println("");
        k.tampilkan();
    }
}
