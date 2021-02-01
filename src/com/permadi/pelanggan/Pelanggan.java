package com.permadi.pelanggan;

public class Pelanggan {

	private String id_pelanggan;
	private String nama_pelanggan;
	private String alamat_pelanggan;
	private String telp_pelanggan;
	
	//	getter dan setter (enkapsulasi) variabel dari isi tabel pelanggan
	public String getId_pelanggan() {
		return id_pelanggan;
	}
	public void setId_pelanggan(String id_pelanggan) {
		this.id_pelanggan = id_pelanggan;
	}
	public String getNama_pelanggan() {
		return nama_pelanggan;
	}
	public void setNama_pelanggan(String nama_pelanggan) {
		this.nama_pelanggan = nama_pelanggan;
	}
	public String getAlamat_pelanggan() {
		return alamat_pelanggan;
	}
	public void setAlamat_pelanggan(String alamat_pelanggan) {
		this.alamat_pelanggan = alamat_pelanggan;
	}
	public String getTelp_pelanggan() {
		return telp_pelanggan;
	}
	public void setTelp_pelanggan(String telp_pelanggan) {
		this.telp_pelanggan = telp_pelanggan;
	}
		 
}
