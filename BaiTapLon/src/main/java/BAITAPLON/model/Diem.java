package BAITAPLON.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "diem")
public class Diem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private float diem;
	
	@ManyToOne
	@JoinColumn(name = "sinhVienId")
	private SinhVien sinhVienDiem;
	

	@ManyToOne
	@JoinColumn(name = "monHocId")
	private MonHoc monHoc;

	
	public String diemChu() {
		if (diem >= 9) {
			return "A+";
		}
		if (diem >= 8.5) {
			return "A";
		}
		if (diem >= 8) {
			return "B+";
		}
		if (diem >= 7) {
			return "B";
		}
		if (diem >= 6.5) {
			return "C+";
		}
		if (diem >= 5.5) {
			return "C";
		}
		if (diem >= 5) {
			return "D+";
		}
		if (diem >= 4) {
			return "D";
		}
		return "F";	
	}
	public float diemSo() {
		if (diem >= 9) {
			return 4;
		}
		if (diem >= 8.5) {
			return Float.parseFloat("3.7");
		}
		if (diem >= 8) {
			return Float.parseFloat("3.5");
		}
		if (diem >= 7) {
			return Float.parseFloat("3");
		}
		if (diem >= 6.5) {
			return Float.parseFloat("2.5");
		}
		if (diem >= 5.5) {
			return Float.parseFloat("2");
		}
		if (diem >= 5) {
			return Float.parseFloat("1.5");
		}
		if (diem >= 4) {
			return Float.parseFloat("1");
		}
		return Float.parseFloat("0");
	}
	public SinhVien getSinhVien() {
		return sinhVienDiem;
	}

	public void setSinhVien(SinhVien sinhVienDiem) {
		this.sinhVienDiem = sinhVienDiem;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
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
	
	
	

}
