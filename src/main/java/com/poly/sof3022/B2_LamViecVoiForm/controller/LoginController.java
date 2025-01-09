package com.poly.sof3022.B2_LamViecVoiForm.controller;

import com.poly.sof3022.B2_LamViecVoiForm.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public String hienThiFormLogin() {
        return "buoi2/login-form";
    }

    //    @PostMapping("ket-qua")
//    public String xuLyFormLogin(
//            @RequestParam("username") String uname,
//            @RequestParam("pass") String password,
//            Model model
//    ) {
//        // B1: Lay du lieu tu view(jsp/thymeleaf => controller)
//        // J4: request.getParamter
//        // J5: @RequestParam
//        model.addAttribute("u1", uname);
//        model.addAttribute("u2", password);
//        return "buoi2/view-ket-qua";
//    }
    @PostMapping("ket-qua")
    public String xuLyFormLogin(
            LoginRequest request,
            Model model
    ) {
        // validate ?
        model.addAttribute("res", request);
        return "buoi2/view-ket-qua";
    }
}
