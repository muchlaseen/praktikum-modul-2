import java.io.IOException;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		int npm, menu;
		String nm, cariNm;
		String[] mk = new String[] {"Teori Graf","PBO", "SO", "Kmputasi Numerik"};
		double[] nts = new double[4];
		double[] nas = new double[4];
		
		Scanner input = new Scanner(System.in);
		Mahasiswa dataMahasiswa = new Mahasiswa();
		
		//		LOGIN FORM
		System.out.print("Masukkan username : ");
		String inputUsername = input.next();
		System.out.print("Masukkan password : ");
		String inputPassword = input.next();

		int count = 0;

		//create while loop, set loop continuation condition to count < 3
		while (count <= 2) {            

		    if ((!inputUsername.equals("admin")) || (!inputPassword.equals("admin"))) {       
		        System.out.print("Login salah. Coba lagi:\n\nMasukkan username : ");
		        inputUsername = input.next();

		        System.out.print("Masukkan password : ");
		        inputPassword = input.next();
		    }   
		    else {
		        System.out.println("You are now logged in");
		        break;
		    }            

		    count++;
		}
				
		
		do
		{
			dataMahasiswa.menuUtama();
			System.out.print("Pilih nomer : ");
			menu = input.nextInt();
			
			switch(menu)
			{
				case 1:
					System.out.print("NPM Mahasiswa		: ");
					npm = input.nextInt();
					System.out.print("Nama Mahasiswa	: ");
					nm = input.next();
					for(int i = 0; i < mk.length; i++)
					{
						System.out.print("Matkul Mahasiswa ke - " + (i+1) + " : " + mk[i] + "\n");
						System.out.print("NTS Mahasiswa		: ");
						nts[i] = input.nextDouble();
						System.out.print("NAS Mahasiswa	: ");
						nas[i] = input.nextDouble();
					}
					dataMahasiswa.tambahData(dataMahasiswa, npm, nm, nts, nas);
					
					break;
					
				case 2:
					System.out.println("Data Mahasiswa");
					dataMahasiswa.lihatData(dataMahasiswa);
					
					break;
					
				case 3:
					System.out.println("Delete Data Mahasiswa");
					dataMahasiswa.deleteData(dataMahasiswa);
					dataMahasiswa.lihatData(dataMahasiswa);
					break;
					
				case 4:
					System.out.println("Delete Data Mahasiswa :: Tambahan");
					System.out.println("Masukkan nama yang akan dihapus : ");
					cariNm = input.next();
					dataMahasiswa.deleteDataPosition(dataMahasiswa, cariNm);
//					dataMahasiswa.lihatData(dataMahasiswa);
					break;
					
				case 5:
					System.err.println("Anda keluar dari program...");
					System.exit(0);
					break;
					
				default:
					System.err.println("Pilihan tidak ada!\n\n");
	
			}
			
		}while(menu < 6);
		
		
		
		
//		data.tambahData(6941, "Muchlas", "Indo", 90, 85);
//		data.tambahData(6940, "Danang", "Indo", 85, 80);
		
	}
}
