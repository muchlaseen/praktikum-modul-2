
public class Node {
	int npmMahasiswa;
	String namaMahasiswa;
	String[] matkulMahasiswa = new String[4];
	double[] nilaiEts = new double [4];
	double[] nilaiEas = new double [4];
	double[] nilaiAkhir = new double [4];

	
	Node next; 
	
	Node(int npmMhs, String nmMhs, double[] nts, double[] nas) 
	{
		this.npmMahasiswa = npmMhs;
		this.namaMahasiswa = nmMhs;
		this.matkulMahasiswa[0] = "Teori Graf";
		this.matkulMahasiswa[1] = "PBO";
		this.matkulMahasiswa[2] = "SO";
		this.matkulMahasiswa[3] = "Komputasi Numerik";
		this.nilaiEts = nts;
		this.nilaiEas = nas;
		this.next = null;
		
	}
	
	
	
}
