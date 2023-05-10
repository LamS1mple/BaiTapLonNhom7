package BAITAPLON.model;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "tenSinhVien")
	private String tenSinhVien;
	
	@Column(name = "taiKhoan")
	private String taiKhoan;
	
	@Column(name = "matKhau")
	private String matKhau;
	
	@Column(name = "kyHocSinhVien")
	private int kyHoc;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	
	public int getKyHoc() {
		return kyHoc;
	}

	public void setKyHoc(int kyHoc) {
		this.kyHoc = kyHoc;
	}

	public List<DangKy> getDangKy() {
		return dangKy;
	}

	public void setDangKy(List<DangKy> dangKy) {
		this.dangKy = dangKy;
	}

	public List<Diem> getDiems() {
		return diems;
	}

	public void setDiems(List<Diem> diems) {
		this.diems = diems;
	}

	@OneToMany(mappedBy = "sinhVienDangKy")
	private List<DangKy> dangKy = new ArrayList<>();
	
	@OneToMany(mappedBy = "sinhVienDiem")
	private List<Diem> diems = new ArrayList<>();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.taiKhoan + " " + this.matKhau + " " + this.tenSinhVien;
	}
	
}
