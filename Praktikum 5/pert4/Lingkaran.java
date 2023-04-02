/**
 * File : MBujurSangkar.java 01/04/2023
 * Penulis : Prisca Della Budiman
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

package pert4;
import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
