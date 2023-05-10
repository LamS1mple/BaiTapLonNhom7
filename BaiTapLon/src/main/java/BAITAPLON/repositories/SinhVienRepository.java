package BAITAPLON.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import BAITAPLON.model.SinhVien;
import java.util.List;


@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
	 SinhVien findByTaiKhoanAndMatKhau( String taiKhoan,
	                           String matKhau);
	 SinhVien findOneById(int id);
}
