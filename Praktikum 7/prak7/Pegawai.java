/**
 * File : Pegawai.java 06/05/2023
 * Penulis : Prisca Della Budiman
 */
package prak7;

public class Pegawai {
    private String nama;
    private int gajiPokok;
    public void setNama(String nama){
        this.nama = nama;
        this.gajiPokok = 5000000; 
    }
    public void tampilData(){
        System.out.printf("Nama : %s, Gaji pokok : %d%n", nama, gajiPokok);
    }
    
}
