/*
 * File : PolimorfismeCoercion.java
 * Penulis : Prisca Della Budiman
 * Deskripsi : Polimorfisme
 * 
 */

package prak7;

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args){
        //deklarasi objek integer
        Integer bilangan = 10;

        //objek gabisa 0 tp primitif bisa 0
        //objek integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}
