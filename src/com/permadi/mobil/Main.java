package com.permadi.mobil;

//import scanner
import java.util.Scanner;

import com.permadi.dbakses.DatabaseAkses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	scanner option perintah		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.print("Pilih perintah SQL : ");
		
		//	menangkap int perintah		
		int p = input.nextInt();
		
		//	object baru mobil		
		Mobil mb = new Mobil();
		
		//	object baru database akses
		DatabaseAkses db = new DatabaseAkses();
		
		//	switch case berdasarkan nilai p (nilai yang user pilih)		
		switch (p) {
		//	case 1 insert mobil
		case 1:
			input = new Scanner(System.in);
			System.out.println("Masukkan ID Mobil\t: ");
			mb.setId_mobil(input.nextLine());
			System.out.println("Masukkan Nomor Plat Mobil\t: ");
			mb.setNo_plat(input.nextLine());
			System.out.println("Masukkan Jenis Mobil\t: ");
			mb.setJenis_mobil(input.nextLine());
			System.out.println("Masukkan Merk Mobil\t: ");
			mb.setMerk(input.nextLine());
			System.out.println("Masukkan Tahun Produksi\t: ");
			mb.setTahun_buat(input.nextLine());
			System.out.println("Masukkan Warna Mobil\t: ");
			mb.setWarna(input.nextLine());
			System.out.println("Masukkan Harga\t: ");
			mb.setHarga(input.nextLine());
			//	get insert data mobil, lalu panggil method insertMobil			
			db.insertMobil(mb.getId_mobil(), mb.getNo_plat(), mb.getJenis_mobil(), mb.getMerk(),
					mb.getTahun_buat(), mb.getWarna(), mb.getHarga());
			break;
			
		case 2:
			input = new Scanner(System.in);
			System.out.println("Masukkan ID Mobil\t: ");
			mb.setId_mobil(input.nextLine());
			System.out.println("Masukkan Nomor Plat Mobil\t: ");
			mb.setNo_plat(input.nextLine());
			System.out.println("Masukkan Jenis Mobil\t: ");
			mb.setJenis_mobil(input.nextLine());
			System.out.println("Masukkan Merk Mobil\t: ");
			mb.setMerk(input.nextLine());
			System.out.println("Masukkan Tahun Produksi\t: ");
			mb.setTahun_buat(input.nextLine());
			System.out.println("Masukkan Warna Mobil\t: ");
			mb.setWarna(input.nextLine());
			System.out.println("Masukkan Harga\t: ");
			mb.setHarga(input.nextLine());
			//	get insert data pelanggan, lalu panggil method update	
			db.updateMobil(mb.getId_mobil(), mb.getNo_plat(), mb.getJenis_mobil(), mb.getMerk(),
					mb.getTahun_buat(), mb.getWarna(), mb.getHarga());
			break;	
			
		case 3:
			input = new Scanner(System.in);
			System.out.print("Masukkan ID Mobil yang akan dihapus\t: ");
			mb.setId_mobil(input.nextLine());
			//	get id mobil yang akan dihapus, lalu panggil method delete mobil
			db.deleteMobil(mb.getId_mobil());
			break;
			
		case 4:
			try {
				//	view tabel mobil
				db.viewMobil();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		//	jika user memasukkan nilai selain yang ditentukan
		default:			
			System.out.println("perintah tidak terdaftar");
			break;
		}		
		
	}

}
