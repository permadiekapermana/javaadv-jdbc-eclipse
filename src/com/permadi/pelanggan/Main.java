package com.permadi.pelanggan;

// import scanner
import java.util.Scanner;

import com.permadi.dbakses.DatabaseAkses;

public class Main {
	public static void main(String[] args) {
		//	scanner option perintah		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.print("masukkan perintah : ");
		
		//	menangkap int perintah		
		int p = input.nextInt();
		//	object baru pelanggan		
		Pelanggan pl = new Pelanggan();
		//	object baru database akses
		DatabaseAkses db = new DatabaseAkses();
		//	switch case berdasarkan nilai p (nilai yang user pilih)		
		switch (p) {
		//	case 1 insert pelanggan
		case 1:
			input = new Scanner(System.in);
			System.out.print("masukkan id_pelanggan : ");
			pl.setId_pelanggan(input.nextLine());
			System.out.print("masukkan nama_pelanggan : ");
			pl.setNama_pelanggan(input.nextLine());
			System.out.print("masukkan alamat_pelanggan : ");
			pl.setAlamat_pelanggan(input.nextLine());
			System.out.print("masukkan telp_pelanggan : ");
			pl.setTelp_pelanggan(input.nextLine());
			//	get insert data pelanggan, lalu panggil method insert			
			db.insert(pl.getId_pelanggan(), pl.getNama_pelanggan(), pl.getAlamat_pelanggan(), 
					pl.getTelp_pelanggan());
			break;
			
		case 2:
			input = new Scanner(System.in);
			System.out.print("masukkan id_pelanggan : ");
			pl.setId_pelanggan(input.nextLine());
			System.out.print("masukkan nama_pelanggan : ");
			pl.setNama_pelanggan(input.nextLine());
			System.out.print("masukkan alamat_pelanggan : ");
			pl.setAlamat_pelanggan(input.nextLine());
			System.out.print("masukkan telp_pelanggan : ");
			pl.setTelp_pelanggan(input.nextLine());
			//	get insert data pelanggan, lalu panggil method update	
			db.update(pl.getId_pelanggan(), pl.getNama_pelanggan(), pl.getAlamat_pelanggan(),
					pl.getTelp_pelanggan());
			break;	
			
		case 3:
			input = new Scanner(System.in);
			System.out.print("masukkan id_pelanggan yang akan dihapus : ");
			pl.setId_pelanggan(input.nextLine());
			//	get id pelanggan yang akan dihapus, lalu panggil method delete	
			db.delete(pl.getId_pelanggan());
			break;
		
		case 4:
			try {
				//	view tabel pelanggan
				db.view();
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