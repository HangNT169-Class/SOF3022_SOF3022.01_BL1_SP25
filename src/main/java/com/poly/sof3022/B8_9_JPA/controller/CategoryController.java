package com.poly.sof3022.B8_9_JPA.controller;

import com.poly.sof3022.B8_9_JPA.entity.Category1;
import com.poly.sof3022.B8_9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @GetMapping("/hien-thi")
    public String hienThiDuLieu(Model model) {
        model.addAttribute("list",repository.findAll());

        // lay tat ca du lieu => findAll
//        repository.findAll();
//        // add / update => save(doi tuong)
//        repository.save(doi tuong);
//        // xoa: Co 2 cach
//        repository.delete(doi tuong);
//        repository.deleteById(khoa chinh);
//        // detail => findById(khoa chinh)
//        repository.findById(khoa chinh);

        return "buoi8/cate";
    }
    @GetMapping("/hien-thi/detail/{a}")
    public String detailDuLieu(Model model, @PathVariable("a") Long id){
        // .get hoac la .orElse: tuy
        Category1 category1 = repository.findById(id).orElse(null);
        // tuong tu
        return "";
    }

}
