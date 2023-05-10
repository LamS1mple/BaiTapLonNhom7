package BAITAPLON.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import BAITAPLON.model.DangKy;
import BAITAPLON.model.SinhVien;

import java.util.List;


public interface DangKyRepository extends JpaRepository<DangKy, Integer>{
	List<DangKy> findBySinhVienDangKy(SinhVien sinhVienDangKy);
}
