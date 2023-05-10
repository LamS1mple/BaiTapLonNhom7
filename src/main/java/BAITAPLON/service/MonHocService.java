package BAITAPLON.service;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import BAITAPLON.model.MonHoc;

@Service
@Component
public interface MonHocService {
	List<MonHoc> getListMonHoc(int kyHoc);
	MonHoc getOneMonHoc(int id);
}
