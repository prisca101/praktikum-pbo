/*
 * File : AngkaSial.java
 * Penulis : Prisca Della Budiman
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * 
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(12);
            as.cobaAngka(10);
            as.cobaAngka(13);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas 'Exception'
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!!");
        }
    }
}

// COMMAND TERMINAL
// javac AngkaSialException.java
// javac AngkaSial.java
// java AngkaSial