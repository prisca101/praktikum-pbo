/**
 * File : MPoligon.java 08/03/2023
 * Penulis : Prisca Della Budiman
 * Deskripsi : driver class untuk poligon dan persegi panjang dan segitiga
 */
 
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(10,5,3);
        segitiga.printInfo();
        System.out.println("Luas segitiga : " + segitiga.hitungLuas());
    }
}
