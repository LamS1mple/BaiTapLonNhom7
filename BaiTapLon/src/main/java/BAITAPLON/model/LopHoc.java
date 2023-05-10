package BAITAPLON.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "lophoc")
public class LopHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String ma;
	
	@Column 
	private String ten;
	
	@Column
	private String tenPhong;
	
	@Column
	private int thu;
	
	@Column
	private String tuanHoc;
	
	@Column
	private int kipHoc;
	
	@OneToMany(mappedBy = "lopHocDangKy")
	private List<DangKy> lopHocDangKy = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "monHocId")
	private MonHoc monHoc ;

	
	
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public int getThu() {
		return thu;
	}

	public void setThu(int thu) {
		this.thu = thu;
	}

	public String getTuanHoc() {
		return tuanHoc;
	}

	public void setTuanHoc(String tuanHoc) {
		this.tuanHoc = tuanHoc;
	}

	public int getKipHoc() {
		return kipHoc;
	}

	public void setKipHoc(int kipHoc) {
		this.kipHoc = kipHoc;
	}

	public List<DangKy> getLopHocDangKy() {
		return lopHocDangKy;
	}

	public void setLopHocDangKy(List<DangKy> lopHocDangKy) {
		this.lopHocDangKy = lopHocDangKy;
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.kipHoc + " " + this.monHoc;
	}
	

}
