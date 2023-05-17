/**
 * Nama : Prisca Della Budiman
 * NIM : 24060121140093
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

 /**
  * T diganti dengan Jar
  Alasan Generic biasa menggunakan T: 
  untuk kemudahan konvensi dan pembacaan. Huruf "T" sering dikaitkan dengan "Type" 
  dan mudah dikenali sebagai penanda tempat jenis generik. Hal ini membantu developer 
  memahami bahwa kode tersebut menggunakan tipe generik dan membuat kode menjadi lebih jelas.
  */

public class BangunDatarGeneric <Jar extends BangunDatar> {
    private Jar bangunDatar;

    public void set(Jar tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public Jar get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

}
