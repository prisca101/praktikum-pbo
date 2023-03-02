/**
  * File : OperasiTitik.java 02/03/23
  * Penulis : Prisca Della Budiman
  * Deskripsi : 
  * kelas yang berisi program utama kelas OperasiTitik
  *
  **/

public class OperasiTitik{
	/*public*/ private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}

	/*public*/ private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}

	public double refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik.getOrdinat();
	}

	public double refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik.getAbsis();
	}

}
