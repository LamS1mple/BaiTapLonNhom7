package BAITAPLON.service.XuLy;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import BAITAPLON.model.LopHoc;
import BAITAPLON.model.MonHoc;
import BAITAPLON.repositories.LopHocRepository;
import BAITAPLON.service.LopHocService;

@Component
@Service
public class LopHocXuLy implements LopHocService {
	
	@Autowired
	private LopHocRepository lopHocRepository;

	public List<LopHoc> getAllList(MonHoc monHoc) {
		return this.lopHocRepository.findByMonHoc(monHoc);
	}
	public LopHoc getOneLopHoc(int id) {
		return lopHocRepository.findOneById(id);
	}
}
