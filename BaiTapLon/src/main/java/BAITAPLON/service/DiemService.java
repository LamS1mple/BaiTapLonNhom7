package BAITAPLON.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import BAITAPLON.model.Diem;
import BAITAPLON.model.SinhVien;

@Service
@Component
public interface DiemService  {
		List<Diem> xemDiem(SinhVien sinhVien);
}
