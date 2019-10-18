
public class Node {
	int npmMahasiswa;
	String namaMahasiswa;
	String[] matkulMahasiswa = new String[] {"Teori Graf","PBO", "SO", "Kmputasi Numerik"};
	double[] nilaiEts = new double[4];
	double[] nilaiEas = new double[4];
	double[] nilaiAkhir = new double[4];

	
	Node next; 
	
	Node(int npmMhs, String nmMhs, double[] nts, double[] nas) 
	{
		this.npmMahasiswa = npmMhs;
		this.namaMahasiswa = nmMhs;
		this.nilaiEts = nts;
		this.nilaiEas = nas;
		this.next = null;
		
	}
	
	
	
}
