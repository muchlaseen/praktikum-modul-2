import java.util.Scanner;

public class Mahasiswa {
	
	Node head;
	Node tail;
	
	void menuUtama()
	{
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Delete");
			System.out.println("4. Delete dengan nama mahasiswa");
			System.out.println("5. Update dengan nama matkul");
			System.out.println("6. Exit");
	}
	
	void menuUpdate()
	{
			System.out.println("1. Nama Mahasiswa");
			System.out.println("2. Nilai Matkul Mahasiswa");
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
				
			}
			System.out.println("\n");
			lihatData = lihatData.next;
		}
	
	}
	
	//	Tambahan Aslab
	public void updateData(Mahasiswa daftar, String nmMhs)
	{
		Scanner update = new Scanner(System.in);
		Node updateData = daftar.head;
		
		menuUpdate();
		System.out.println("Data mana yang mau diupdate : ");
		int cariData = update.nextInt();
		
		switch(cariData)
		{
			case 1:
				System.out.println("=> Update Nama Mahasiswa");
				while (updateData != null)
				{
					if(updateData.namaMahasiswa.equals(nmMhs))
					{
						System.out.print("Update nama : ");
						String gantiNama = update.next();
						updateData.namaMahasiswa = gantiNama;
					}
					updateData = updateData.next;
				}
				break;
				
			case 2:
				System.out.println("=> Update Nilai Mahasiswa");
				System.out.println("\nMasukkan matkul yang dicari : ");
				String cariMk = update.next();
				while (updateData != null)
				{
					if(updateData.namaMahasiswa.equals(nmMhs))
					{
						for(int i = 0; i < updateData.matkulMahasiswa.length; i++)
						{
							if(updateData.matkulMahasiswa[i].equals(cariMk))
							{
									System.out.println("Update Nilai");
									System.out.print("Nilai ETS  : ");
									double ubahNts = update.nextDouble();
									updateData.nilaiEts[i] = ubahNts;
									
									System.out.print("Nilai EAS  : ");
									double ubahNas = update.nextDouble();
									updateData.nilaiEas[i] = ubahNas;
							}
								
						}
					}
					updateData = updateData.next;
				}
				break;
				
			default:
				System.err.println("Pilihan tidak ada!");
				break;
		}
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
