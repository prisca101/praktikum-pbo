/**
 * Nama : Prisca Della Budiman
 * NIM  : 24060121140093
 * File : ReadSerializablePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */

package Serialization;

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}
