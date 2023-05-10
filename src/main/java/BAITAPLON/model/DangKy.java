package BAITAPLON.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dangky")
public class DangKy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "sinhVienId")
	private SinhVien sinhVienDangKy;
	
	@ManyToOne
	@JoinColumn(name = "lopHocId")
	private LopHoc lopHocDangKy ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SinhVien getSinhVienDangKy() {
		return sinhVienDangKy;
	}

	public void setSinhVienDangKy(SinhVien sinhVienDangKy) {
		this.sinhVienDangKy = sinhVienDangKy;
	}

	public LopHoc getLopHocDangKy() {
		return lopHocDangKy;
	}

	public void setLopHocDangKy(LopHoc lopHocDangKy) {
		this.lopHocDangKy = lopHocDangKy;
	}

	
	
	
}
