package com.poly.sof3022.B1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    /**
     * Bean: Bat buoc phai danh dau bang cac annotaion:
     * + @Controller: Tang chua cac request va trao doi vs jsp/FE/thymleaf
     * + @Repository: Tang trao truc tiep vs CSDL
     * + @Service: Tang xu ly logic toan bo project
     * + @Component: Danh dau 1 lop (class) la 1 bean chung: K lam bat cu 1 trong 3 nhiem vu tren
     * HTTP Methods : J4 & J5:
     * + Get: Hien thi, lay..
     * + Post: Xu ly form
     * Tat ca cac ham trong @Controller => LUON LUON TRA VE 1 STRING (RETURN 1 VIEW)
     */
    @GetMapping("test")
    // import model => .ui
    public String hienThi(Model model) {
        // Truyen gia tri tu controller => view
        // J4: request.setAttribute
        // J5: model.addAttribute
        model.addAttribute("mess1","SOF3022 - Java 5");
        return "buoi1";
    }
}
