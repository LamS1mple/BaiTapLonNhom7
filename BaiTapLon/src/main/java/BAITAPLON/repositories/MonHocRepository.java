package BAITAPLON.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import BAITAPLON.model.MonHoc;


@Repository
public interface MonHocRepository extends JpaRepository<MonHoc, Integer>{
	List<MonHoc> findByKyHocMonHoc(int kyHocMonHoc);
	MonHoc findOneById(int id);
}
