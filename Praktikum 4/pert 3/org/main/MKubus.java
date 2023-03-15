/**
 * File : MPoligon.java 15/03/2023
 * Penulis : Prisca Della Budiman
 * Deskripsi : driver class untuk poligon dan bujursangkar dan kubus
 */
 
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujursangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujursangkar);

        System.out.println("Volume kubus : " + kubus.hitungVolume());
        System.out.println("Luas alas kubus : " + kubus.hitungLuasAlas());
    }
}
