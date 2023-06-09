package BAITAPLON.CONTROLLER;

import java.lang.ProcessBuilder.Redirect;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.atmosphere.config.service.Get;
import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import BAITAPLON.model.DangKy;
import BAITAPLON.model.Diem;
import BAITAPLON.model.LopHoc;
import BAITAPLON.model.MonHoc;
import BAITAPLON.model.SinhVien;
import BAITAPLON.repositories.LopHocRepository;
import BAITAPLON.service.XuLy.DangKyXuLy;
import BAITAPLON.service.XuLy.DiemXuLy;
import BAITAPLON.service.XuLy.LopHocXuLy;
import BAITAPLON.service.XuLy.MonHocXuLy;
import BAITAPLON.service.XuLy.SinhVienXuLy;
import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import javassist.expr.NewArray;
import net.bytebuddy.asm.Advice.This;

@Controller
@Component
public class DangKyController {
	
	@Autowired
	private MonHocXuLy monHocXuLy;
	@Autowired
	private LopHocXuLy lopHocXuLy;
	@Autowired
	private DangKyXuLy dangKyXuLy;
	@Autowired
	private DiemXuLy diemXuLy;
	
	@GetMapping("/dangky")
	public String dangKy(ModelMap monhocs,ModelMap dangKys  , HttpSession session) {
		SinhVien sVien = (SinhVien) session.getAttribute("SINHVIEN");
		List<MonHoc> monHocs = this.monHocXuLy.getListMonHoc(sVien.getKyHoc());
		monhocs.addAttribute("monHocs",monHocs);
		List<DangKy> dangKies = dangKyXuLy.getAllDangKyBySV(sVien);
		
		for (DangKy i : dangKies) {
			System.out.println(i.getId());
		}
		
		dangKys.addAttribute("dangKys" , dangKies);
//		for (MonHoc iHoc : monHocs) {
//			System.out.println(iHoc);
//			
//		}
		return "dangkyhoc";
	}
	
	@GetMapping( "/dangky/{id}")
	public String xemLopHoc(@PathVariable("id") int id , ModelMap lophocs ,ModelMap monhocMap) {
//		System.out.println(id);
		monhocMap.addAttribute("chonlop" , new MonHoc());
		MonHoc monHoc = this.monHocXuLy.getOneMonHoc(id);
//		System.out.println(monHoc);
		List<LopHoc> lopHocs = this.lopHocXuLy.getAllList(monHoc);
		lophocs.addAttribute("lophocs" , lopHocs);
//		for(LopHoc i : lopHocs) {
//			System.out.println(i);
//		}
		return "chitietlop";
	}
	@GetMapping("/guidangkyMon")
	public String guiDangKy(@RequestParam("chonlop") int chonlop,
			HttpSession session) {
		SinhVien sVien = (SinhVien) session.getAttribute("SINHVIEN");

		DangKy dKy = new DangKy();
		LopHoc lopHoc = this.lopHocXuLy.getOneLopHoc(chonlop);
		
		String check = lopHoc.getMonHoc().getMaMonHoc();
		List<DangKy> dangKies = dangKyXuLy.getAllDangKyBySV(sVien);
		
		boolean dung = true;
		
		for (DangKy i : dangKies) {
			if(i.getLopHocDangKy().getMonHoc().getMaMonHoc().equals(check)) {
				dung = false;
			}
		}
		
		if(dung) {
			dKy.setLopHocDangKy(lopHoc);
			dKy.setSinhVienDangKy(sVien);
			this.dangKyXuLy.Luu(dKy);
		}
		
		return "redirect:/dangky";
	}
	
	
	@GetMapping("/xoa/{id}")
	public String Xoa(@PathVariable("id") int id ) {
		System.out.println(id);
		this.dangKyXuLy.xoa(id);
		return "redirect:/dangky";
	}
	
	@GetMapping("/xemthoikhoabieu")
	public String thoikhoabieu(ModelMap modelMap , HttpSession session) {
		SinhVien sVien = (SinhVien) session.getAttribute("SINHVIEN");
		List<DangKy> dangKies = dangKyXuLy.getAllDangKyBySV(sVien);
		modelMap.addAttribute("dangkys" , dangKies);
		return "xemthoikhoahieu";
	}
	
	@GetMapping("/danhsachsinhvien/{id}")
	public String xemdanhsach(@PathVariable("id") int id , ModelMap modelMap) {
		LopHoc lpHoc = lopHocXuLy.getOneLopHoc(id);
		List<DangKy> dangKies = dangKyXuLy.getAllSinhvien(lpHoc);
		modelMap.addAttribute("dangkys" , dangKies);
		return "danhsachSV";
	}
	
	@GetMapping("/xemdiem")
	public String xemDiem(ModelMap modelMap , HttpSession session) {
		SinhVien sVien = (SinhVien) session.getAttribute("SINHVIEN");
		List<Diem> diems = this.diemXuLy.xemDiem(sVien);
		
		modelMap.addAttribute("diems" ,diems);
		return "diem";
	}
	
	@GetMapping("/suathongtin")
	public String suathongtin() {
		return "form";
	}
	
}
