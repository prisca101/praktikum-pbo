/**
 * Nama : Prisca Della Budiman
 * NIM  : 24060121140093
 * File : DiskonLambda.java
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga*0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga*0.4);

        //dengan lambda dengan blok statemnt
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga*0.1);
        };

        /*
         * Dapatkah anda membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan ? 
         * Jawab:
         * kedua diskon menggunakan ekspresi lambda untuk mengembalikan harga setelah diskon namun 
         * diskonLebaran tidak menggunakan blok statement sedangkan diskonBiasa menggunakan blok statement. 
         * Blok statement dalam ekspresi lambda digunakan untuk menjalankan beberapa pernyataan 
         * atau kode yang lebih kompleks daripada hanya satu pernyataan tunggal.
         * diskonLebaran secara langsung menghitung dan mengembalikan harga diskon dengan mengurangi 
         * 40% dari harga asli. 
         * diskonBiasa menghitung dan mengembalikan harga diskon dengan mengurangi 10% dari harga asli. 
         * Namun, ekspresi lambda ini menggunakan blok statement {} untuk melingkupi kode dan secara eksplisit 
         * menentukan pernyataan return untuk mengembalikan harga diskon.
         */

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));

    }
}
