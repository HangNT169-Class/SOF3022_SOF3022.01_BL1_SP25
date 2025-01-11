package com.poly.sof3022.B3_SpringValidation.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DangKyRequest {

    @NotBlank(message = "Ma SV k duoc de trong")
    private String maSV;

    @NotEmpty(message = "Ten SV khong duoc de trong")
    private String tenSV;

    @NotNull
//    https://techmaster.vn/posts/36877/xac-thuc-request-bang-spring-boot-validation
    private Integer tuoiSV;
    private Boolean gioiTinh;

}
