package BAITAPLON.CONTROLLER;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import BAITAPLON.DTO.SinhVienDTO;
import BAITAPLON.model.SinhVien;
import BAITAPLON.service.XuLy.SinhVienXuLy;
import jakarta.servlet.http.HttpSession;


@Controller
@Component
public class SinhVienController {
	@Autowired(required = true)
	private SinhVienXuLy sinhVienXuLy;
	
	
	@GetMapping("/")
	public String hienThi() {
		return "dangnhap";
	}
	
	
	@GetMapping("/trangchu")
	public String hienThi1() {
		return "trangchu";
	}
	
	@PostMapping("/")
	public String loginString(@ModelAttribute("sinhvien") SinhVienDTO sinhVien ,HttpSession session ) {
		
		SinhVien sv =  sinhVienXuLy.getSinhVien(sinhVien.getTaiKhoan(), sinhVien.getMatKhau());
		if (sv != null) {
			session.setAttribute("SINHVIEN", sv);
			return "trangchu";
		}
		return "dangnhap";
	}
	
	@GetMapping("/dangxuat")
	public String dangXuat(HttpSession session) {
		System.out.println((SinhVien) session.getAttribute("SINHVIEN"));
		session.invalidate();

		return "redirect:/";
	}
	
	
	
	
	
	
}
