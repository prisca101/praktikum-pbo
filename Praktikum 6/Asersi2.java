/*
 * File : Asersi2.java
 * Penulis : Prisca Della Budiman
 * Deskripsi : Program untuk demo asersi, yang akan menolak
 *             input jari-jari lingkaran yang bernilai nol
 * 
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 4;
        assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
//JAWABAN : secara konsep sudah benar sebab asersi akan menolak input yang bernilai
//          kurang dari atau sama dengan nol untuk menghindari kesalahan saat menghitung
//          keliling lingkaran (keliling tidak bisa bernilai 0 atau negatif).
//          ketika asersi tercapai, program akan langsung berhenti / terminate dan mengeluarkan
//          'AssertionError' sehingga bisa langsung mengidentifikasi masalah dan solusinya.

//          Assertions are typically used during development & testing cycle to catch bugs.
//          They allow developers to quickly identify and fix problems in the code
//          before the code is released to users.
