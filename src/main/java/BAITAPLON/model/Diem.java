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
