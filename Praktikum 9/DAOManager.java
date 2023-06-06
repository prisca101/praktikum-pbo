/**
 * Nama : Prisca Della Budiman
 * NIM : 24060121140093
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}
