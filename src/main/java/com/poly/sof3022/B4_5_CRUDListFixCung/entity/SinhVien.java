package com.poly.sof3022.B4_5_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SinhVien {
    private  String mssv;
    private String ten;
    private  int tuoi;
    private String diaChi;
    private Boolean gioiTinh;
}
