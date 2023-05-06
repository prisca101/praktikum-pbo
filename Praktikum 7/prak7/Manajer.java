package prak7;

public class Manajer extends Pegawai{
    int tunjangan;
    Manajer(String nama){
        super.setNama(nama);
        tunjangan = 700000;
    }
    void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
