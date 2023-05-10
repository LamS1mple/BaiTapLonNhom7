package BAITAPLON.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import BAITAPLON.model.DangKy;
import BAITAPLON.model.SinhVien;

@Service
@Component
public interface DangKyService {
	void Luu(DangKy dangKy);
	List<DangKy> getAllDangKyBySV(SinhVien sinhVien);
}
