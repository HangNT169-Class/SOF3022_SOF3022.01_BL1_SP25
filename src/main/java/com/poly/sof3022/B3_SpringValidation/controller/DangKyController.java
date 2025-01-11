package com.poly.sof3022.B3_SpringValidation.controller;

import com.poly.sof3022.B3_SpringValidation.request.DangKyRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DangKyController {
    @GetMapping("dang-ki")
    public String formDangKy(Model model) {
        model.addAttribute("request1", new DangKyRequest());
        return "buoi3/dang-ky";
    }

    @PostMapping("output-form")
    public String xuLyForm(@Valid @ModelAttribute("request1") DangKyRequest dangKyRequest,
                           BindingResult result,
                           Model model) {
        if(result.hasErrors()){
            return "buoi3/dang-ky";
        }
        model.addAttribute("req", dangKyRequest);
        return "buoi3/output-form";
    }

}
