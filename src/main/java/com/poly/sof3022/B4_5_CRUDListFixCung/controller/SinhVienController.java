package com.poly.sof3022.B4_5_CRUDListFixCung.controller;

import com.poly.sof3022.B4_5_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3022.B4_5_CRUDListFixCung.service.DongVatService;
import com.poly.sof3022.B4_5_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService service;

    @Autowired
    private DongVatService service1;

    // hien thi du lieu
    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {
        model.addAttribute("lists", service.getListSinhVien());
        return "buoi4/sinh-viens";
    }

    @GetMapping("sinh-vien/remove/{a}")
    public String removeSinhVien(@PathVariable("a") String mssv) {
        service.removeSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("sinh-vien/deltail/{b}")
    public String detail(
            @PathVariable("b") String mssv,
            Model model
    ) {
        model.addAttribute("sv", service.detailSinhVien(mssv));
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("sinh-vien/view-update/{c}")
    public String update(
            @PathVariable("c") String mssv, Model model) {
        model.addAttribute("sv", service.detailSinhVien(mssv));
        return "buoi4/update-sinh-vien";
    }

    @GetMapping("sinh-vien/view-add")
    public String hienThiFormAdd() {
        return "buoi4/add-sinh-vien";
    }

    @PostMapping("sinh-vien/add")
    public String addSinhVien(SinhVien sv) {
        service.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }

}
