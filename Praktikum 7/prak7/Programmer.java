package prak7;

public class Programmer extends Pegawai{
    int bonus;
    Programmer(String nama){
        super.setNama(nama);
        bonus = 450000;
    }
    void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    };
}
