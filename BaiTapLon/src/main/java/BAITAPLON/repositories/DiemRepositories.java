package BAITAPLON.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import BAITAPLON.model.Diem;
import BAITAPLON.model.SinhVien;

public interface DiemRepositories extends JpaRepository<Diem, Integer> {
	List<Diem> findBySinhVienDiem(SinhVien sinhVien);

}
