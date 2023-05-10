package BAITAPLON.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import BAITAPLON.model.LopHoc;
import BAITAPLON.model.MonHoc;

public interface LopHocRepository extends JpaRepository<LopHoc, Integer> {
	List<LopHoc> findByMonHoc(MonHoc monHoc);
	LopHoc findOneById(int id);
}
