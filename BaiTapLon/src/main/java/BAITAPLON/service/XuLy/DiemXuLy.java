package BAITAPLON.service.XuLy;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BAITAPLON.model.Diem;
import BAITAPLON.model.SinhVien;
import BAITAPLON.repositories.DiemRepositories;
import BAITAPLON.service.DiemService;

@Component
@Service
public class DiemXuLy implements DiemService{
	
	@Autowired
	private DiemRepositories diemRepositories;
	
	@Override
	public List<Diem> xemDiem(SinhVien sinhVien) {
		return this.diemRepositories.findBySinhVienDiem(sinhVien);
	}
	
}
