package com.permadi.dbakses;

// import java sql semua package
import java.sql.*;

import com.permadi.pelanggan.Pelanggan;
import com.permadi.mobil.Mobil;

public class DatabaseAkses {
	//	var koneksi, statement, resultset	
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	//	object pelanggan	
	Pelanggan pl = new Pelanggan();
	//	object mobil
	Mobil mb = new Mobil();
	
	//	method databas eakses	
	public DatabaseAkses() {
		//	url localhost, port mysql, database		
		String url = "jdbc:mysql://localhost:3306/rentalmobil";
		//	username localhost		
		String user = "root";
		//	password localhost		
		String password = "";
		//	exception koneksi		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {			
			System.out.println(e);
		}
	}
	
	//	method view / select data tabel	
	public static void view() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT * FROM tabel_pelanggan");
		
		while(rs.next()) {
			System.out.println("id_pelanggan : " + rs.getString(1) + " ");
			System.out.println("nama_pelanggan : " + rs.getString(2) + " ");
			System.out.println("alamat_pelanggan : " + rs.getString(3) + " ");
			System.out.println("telp_pelanggan : " + rs.getString(4) + "\n");			
		}
	}
	
	//	method insert/input data 	
	public static void insert(String id_pelanggan, String nama_pelanggan, 
			String alamat_pelanggan, String telp_pelanggan) {
		try {
			st = con.createStatement();
			st.executeUpdate("INSERT INTO tabel_pelanggan (id_pelanggan, nama_pelanggan, "
				 + "alamat_pelanggan, telp_pelanggan) VALUES ('"
				 +id_pelanggan+"', '"+nama_pelanggan+"', '"+alamat_pelanggan+"', '"
				 +telp_pelanggan+"')");
			System.out.println("insert data berhasil!");
		} catch (SQLException e) {
			System.out.println("insert gagal");
			e.printStackTrace();
		}		
	}
	
	//	method update data	
	public static void update(String id_pelanggan, String nama_pelanggan, 
			String alamat_pelanggan, String telp_pelanggan) {
		try {
			st = con.createStatement();
			st.executeUpdate("UPDATE tabel_pelanggan SET nama_pelanggan = '"+nama_pelanggan+"', "
				 + "alamat_pelanggan = '"+alamat_pelanggan+"', telp_pelanggan = '"+telp_pelanggan+"' "
				 + "WHERE id_pelanggan = '"+id_pelanggan+"'");
			System.out.println("update data berhasil!");
		} catch (SQLException e) {
			System.out.println("update gagal");
			e.printStackTrace();
		}		
	}
	
	//	method delete data	
	public static void delete(String id_pelanggan) {
		try {
			st = con.createStatement();
			st.executeUpdate("DELETE FROM tabel_pelanggan WHERE id_pelanggan = '"+id_pelanggan+"'");
			System.out.println("delete data berhasil!");
		} catch (SQLException e) {
			System.out.println("delete gagal");
			e.printStackTrace();
		}		
	}
	
	//	method view / select data tabel	
	public static void viewMobil() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("SELECT * FROM tabel_mobil");
		
		while(rs.next()) {
			System.out.println("id_mobil : " + rs.getString(1) + " ");
			System.out.println("no_plat : " + rs.getString(2) + " ");
			System.out.println("jenis_mobil : " + rs.getString(3) + " ");
			System.out.println("merk : " + rs.getString(4) + " ");
			System.out.println("tahun_buat : " + rs.getString(5) + " ");
			System.out.println("warna : " + rs.getString(6) + " ");
			System.out.println("harga : " + rs.getString(7) + "\n");			
		}
	}
	
	//	method insert/input data Mobil	
	public static void insertMobil(String id_mobil, String no_plat, 
			String jenis_mobil, String merk, String tahun_buat, String warna, String harga) {
		try {
			st = con.createStatement();
			st.executeUpdate("INSERT INTO tabel_mobil (id_mobil, no_plat, "
				+ "jenis_mobil, merk, tahun_buat, warna, harga) VALUES ('"
				+id_mobil+"', '"+no_plat+"', '"+jenis_mobil+"', '"
				+merk+"', '"+tahun_buat+"', '"+warna+"','"+harga+"')");
			System.out.println("Insert Data Mobil Berhasil!");
		} catch (SQLException e) {
			System.out.println("Insert Data Mobil Gagal!");
			e.printStackTrace();
		}		
	}
	
	//	method update data mobil	
	public static void updateMobil(String id_mobil, String no_plat, 
			String jenis_mobil, String merk, String tahun_buat, String warna, String harga) {
		try {
			st = con.createStatement();
			st.executeUpdate("UPDATE tabel_mobil SET no_plat = '"+no_plat+"', "
				 + "jenis_mobil = '"+jenis_mobil+"', merk = '"+merk+"' , "
				 + "tahun_buat = '"+tahun_buat+"', "
				 + "warna = '"+warna+"', harga = '"+harga+"' "
				 + "WHERE id_mobil = '"+id_mobil+"'");
			System.out.println("Update Data Mobil Berhasil!");
		} catch (SQLException e) {
			System.out.println("Update Data Mobil Gagal!");
			e.printStackTrace();
		}		
	}
	
	//	method delete data	
	public static void deleteMobil(String id_mobil) {
		try {
			st = con.createStatement();
			st.executeUpdate("DELETE FROM tabel_mobil WHERE id_mobil = '"+id_mobil+"'");
			System.out.println("Delete Data Mobil Berhasil!");
		} catch (SQLException e) {
			System.out.println("Delete Data Mobil Gagal!");
			e.printStackTrace();
		}		
	}

}