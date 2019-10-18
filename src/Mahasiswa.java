
public class Mahasiswa {
	
	Node head;
	Node tail;
	
	void menuUtama()
	{
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Delete");
			System.out.println("4. Delete dengan nama");
			System.out.println("5. Exit");
	}
	
	public void tambahData(Mahasiswa daftar, int npmMhs, String nmMhs, double[] ntsMhs, double[] nasMhs) 
	{
		Node dataMhs = new Node(npmMhs, nmMhs, ntsMhs, nasMhs);
		if(daftar.head==null) 
		{
			daftar.head = dataMhs;
		}
		else
		{
			Node temp = daftar.head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = dataMhs;
		}
			
	}
	
	public void lihatData(Mahasiswa daftar)
	{
		double sum = 0;
		
		Node lihatData = daftar.head;
		while (lihatData!=null)
		{
			System.out.println(lihatData.npmMahasiswa + " -> " + lihatData.namaMahasiswa);
			System.out.println("==============");
			for(int i = 0; i < lihatData.matkulMahasiswa.length; i++)
			{
				System.out.println("Matkul ke - " + (i+1) + " : " + lihatData.matkulMahasiswa[i]);
				System.out.println("Nilai ETS : " + lihatData.nilaiEts[i]);
				System.out.println("Nilai EAS : " + lihatData.nilaiEas[i]);
				
				lihatData.nilaiAkhir[i] = (lihatData.nilaiEts[i] + lihatData.nilaiEas[i])/2;
				System.out.println("Nilai Akhir : " + lihatData.nilaiAkhir[i]);
//				System.out.println("Nilai Akhir : " + sum);
//				sum += lihatData.nilaiAkhir[i];
				
			}
			
//			System.out.println("Nilai akhir : " + (sum/4));
			System.out.println("\n");
			
			
			lihatData = lihatData.next;
		}
	
	}
	
	//	Tambahan Aslab
	public void updateData(Mahasiswa daftar, String nmMhs)
	{
		
	}

	
	public void deleteData(Mahasiswa daftar)
	{
		if(daftar.head== null)
		{
			System.err.println("List sudah kosong!");
			return;
		}
		else
		{
			Node akhirNode = head;
			while (akhirNode.next.next != null)
			{
				akhirNode = akhirNode.next;
			}
			akhirNode.next = null;
		}
		
	}
	
//	Tambahan Delete Node ::  Nama
	public void deleteDataPosition(Mahasiswa daftar, String nmDicari)
	{
		Node currNode = daftar.head, prevNode = null;
		
		if(currNode != null && currNode.namaMahasiswa.equals(nmDicari))
		{
			daftar.head = currNode.next;
			System.out.println(nmDicari + " nama ditemukan dan dihapus!");
		}
		
		while(currNode != null && !currNode.namaMahasiswa.equals(nmDicari))
		{
			prevNode = currNode;
			currNode = currNode.next;
		}
		
		if(currNode != null) 
		{
			prevNode.next = currNode.next;
			System.out.println(nmDicari + " nama ditemukan dan dihapus!");
		}
		else
		{
			System.err.println("Maaf, " + nmDicari+ " tidak ditemukan...\n");
		}
		
		
	}
}
