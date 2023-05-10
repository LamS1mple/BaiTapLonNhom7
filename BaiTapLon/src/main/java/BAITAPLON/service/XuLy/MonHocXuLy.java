package BAITAPLON.service.XuLy;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BAITAPLON.model.MonHoc;
import BAITAPLON.repositories.MonHocRepository;
import BAITAPLON.service.MonHocService;



@Component
@Service
public class MonHocXuLy implements MonHocService{
	
	@Autowired
	private MonHocRepository monHocRepository;
	
	public List<MonHoc> getListMonHoc(int kyHoc) {
		return this.monHocRepository.findByKyHocMonHoc(kyHoc);
	}
	
	public MonHoc getOneMonHoc(int id) {
		return this.monHocRepository.findOneById(id);
	}

}
