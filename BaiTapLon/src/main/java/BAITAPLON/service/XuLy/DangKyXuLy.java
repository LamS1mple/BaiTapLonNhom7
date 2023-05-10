package BAITAPLON.service.XuLy;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BAITAPLON.model.DangKy;
import BAITAPLON.model.LopHoc;
import BAITAPLON.model.SinhVien;
import BAITAPLON.repositories.DangKyRepository;
import BAITAPLON.service.DangKyService;
@Component
@Service
public class DangKyXuLy implements DangKyService{

	@Autowired
	DangKyRepository dangKyRepository;
	
	@Override
	public void Luu(DangKy dangKy) {
		this.dangKyRepository.save(dangKy);
	}

	@Override
	public List<DangKy> getAllDangKyBySV(SinhVien sinhVien) {
		return this.dangKyRepository.findBySinhVienDangKy(sinhVien);
	}
	
	
	
	@Override
	public void xoa(int id) {
		this.dangKyRepository.deleteById(id);
	}

	@Override
	public List<DangKy> getAllSinhvien(LopHoc lopHoc) {
		return dangKyRepository.findByLopHocDangKy(lopHoc);
	}
}
