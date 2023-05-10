package BAITAPLON.service.XuLy;

import java.util.List;



import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BAITAPLON.model.SinhVien;
import BAITAPLON.repositories.SinhVienRepository;
import BAITAPLON.service.SinhVienService;


@Component
@Service
public class SinhVienXuLy implements SinhVienService{
	
	@Autowired
	private SinhVienRepository sinhVienRepository;

	@Override
	public SinhVien getSinhVien(String taiKhoan, String matKhau) {
		return this.sinhVienRepository.findByTaiKhoanAndMatKhau(taiKhoan, matKhau);
	}

	@Override
	public SinhVien getOneSinhVien(int id) {
		return this.sinhVienRepository.findOneById(id);
	}

}
