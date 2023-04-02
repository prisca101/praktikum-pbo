/**
 * File : MLingkaran.java 01/04/2023
 * Penulis : Prisca Della Budiman
 * Deskripsi : implementasi cara menghitung luas lingkaran
*/
package pert4;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        // Lingkaran l = new Lingkaran(10.2);
        // System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l.hitungLuas());

        Scanner scan = new Scanner(System.in);
        double jejari = scan.nextDouble();
        scan.close();

        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());

    }
}
