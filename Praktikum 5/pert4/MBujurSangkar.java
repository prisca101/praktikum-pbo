/**
 * File : MBujurSangkar.java 01/04/2023
 * Penulis : Prisca Della Budiman
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

 package pert4;
 import java.util.Scanner;

 public class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");

        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
