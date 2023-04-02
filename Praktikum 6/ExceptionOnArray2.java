/*
 * File : ExceptionOnArray2.java
 * Penulis : Prisca Della Budiman
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 * 
 */

 import java.io.IOException;

public class ExceptionOnArray2 {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try{
            arrayInteger[2] = 11;
            //arrayInteger[4] = 10;
            throw new IOException();
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } catch(IOException exception){
            System.out.println("IOException caught");
        } finally {
            System.out.println("clean up code...");
        }
    }
}
