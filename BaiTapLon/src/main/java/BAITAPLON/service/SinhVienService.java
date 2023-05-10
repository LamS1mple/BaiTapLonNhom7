package BAITAPLON.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import BAITAPLON.model.SinhVien;
@Component
@Service
public interface SinhVienService {
	SinhVien getSinhVien(String taiKhoan, String matKhau);
	SinhVien getOneSinhVien(int id);
}
