package prak7;

public class Manajer extends Pegawai{
    private int tunjangan;
    public Manajer(String nama){
        super.setNama(nama);
        tunjangan = 700000;
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
