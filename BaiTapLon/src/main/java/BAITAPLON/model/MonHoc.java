package BAITAPLON.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "monhoc")
public class MonHoc {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	
	@Column
	private String tenMonHoc;
	
	
	@Column(name = "kyHocMonHoc")
	private int kyHocMonHoc;
	
	public int getKyhoc() {
		return kyHocMonHoc;
	}

	public void setKyhoc(int kyHocMonHoc) {
		this.kyHocMonHoc = kyHocMonHoc;
	}

	public void setDiemMonHoc(List<Diem> diemMonHoc) {
		this.diemMonHoc = diemMonHoc;
	}

	@Column
	private String maMonHoc;
	
	@Column
	private int tinChi;
	

	@OneToMany(mappedBy = "monHoc")
	private List<LopHoc> lopMonHoc = new ArrayList<>();
	
	@OneToMany(mappedBy = "monHoc")
	private List<Diem> diemMonHoc = new ArrayList<>();

	public int getId() {
		return id;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public String getMaMonHoc() {
		return maMonHoc;
	}

	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}

	public int getTinChi() {
		return tinChi;
	}

	public void setTinChi(int tinChi) {
		this.tinChi = tinChi;
	}

	

	public int getKyHocMonHoc() {
		return kyHocMonHoc;
	}

	public void setKyHocMonHoc(int kyHocMonHoc) {
		this.kyHocMonHoc = kyHocMonHoc;
	}

	public void setKyHoc(int kyHoc) {
		this.kyHocMonHoc = kyHoc;
	}

	public List<LopHoc> getLopMonHoc() {
		return lopMonHoc;
	}

	public void setLopMonHoc(List<LopHoc> lopMonHoc) {
		this.lopMonHoc = lopMonHoc;
	}

	public List<Diem> getDiemMonHoc() {
		return diemMonHoc;
	}
	
	
	@Override
	public String toString() {
		
		return this.id + " " + this.maMonHoc + " " + this.tenMonHoc;
	}
	
}
