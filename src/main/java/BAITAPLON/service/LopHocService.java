package BAITAPLON.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import BAITAPLON.model.LopHoc;
import BAITAPLON.model.MonHoc;


@Service
@Component
public interface LopHocService {
	List<LopHoc> getAllList(MonHoc monHoc);
	LopHoc getOneLopHoc(int id);
}
