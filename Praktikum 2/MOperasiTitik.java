/**
  * File : MOperasiTitik.java 02/03/23
  * Penulis : Prisca Della Budiman
  * Deskripsi : 
  * kelas yang berisi main dari OperasiTitik
  *
  **/

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,4);
		Titik t1 = new Titik(5,6);

		OperasiTitik o = new OperasiTitik();	

		// System.out.println("Awal:\nAbsis dari t adalah " + t.getAbsis() + " dan ordinatnya adalah " + t.getOrdinat());
		// o.refleksiSumbuX(t);
		// System.out.println("\nHasil Akhir:\nAbsis dari t adalah " + t.getAbsis() + " dan ordinatnya adalah " + t.getOrdinat());
		// o.refleksiSumbuY(t);
		// System.out.println("Absis dari t adalah " + t.getAbsis() + " dan ordinatnya adalah " + t.getOrdinat());

		System.out.println("\nAwal: Absis dari t1 adalah " + t1.getAbsis() + " dan ordinatnya adalah " + t1.getOrdinat());
		System.out.println("RefleksiX: Absis = " + t1.getAbsis() + " Ordinat = " + o.refleksiX(t1));
		System.out.println("RefleksiY: Absis = " + o.refleksiY(t1) + " Ordinat = " + t1.getOrdinat());

	}
}