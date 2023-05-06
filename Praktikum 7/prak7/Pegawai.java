package prak7;

public class Pegawai {
    String nama;
    int gajiPokok;
    void setNama(String nama){
        this.nama = nama;
        this.gajiPokok = 5000000; 
    }
    void tampilData(){
        System.out.printf("Nama : %s, Gaji pokok : %d%n", nama, gajiPokok);
    }
    
}
