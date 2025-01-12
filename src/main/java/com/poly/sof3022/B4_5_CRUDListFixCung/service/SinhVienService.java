package com.poly.sof3022.B4_5_CRUDListFixCung.service;

import com.poly.sof3022.B4_5_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    // xu ly logic cua toan bo project
    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienService() {
        // them phan tu vao list
        listSinhVien.add(new SinhVien("01", "trung", 20, "cau giay - ha noi", true));
        listSinhVien.add(new SinhVien("02", "tuan", 21, "gg", true));
        listSinhVien.add(new SinhVien("03", "huyen", 18, "nam dinh", false));
        listSinhVien.add(new SinhVien("04", "linh", 19, "Ninh Binh", false));
        listSinhVien.add(new SinhVien("05", "Trang", 22, "Hung Yen", false));
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void addSinhVien(SinhVien sv) {
        listSinhVien.add(sv);
    }

    public void removeSinhVien(String mssv) {
        listSinhVien.removeIf(s -> s.getMssv().equalsIgnoreCase(mssv));
    }
    // filter
    public SinhVien detailSinhVien(String mssv){
        for (SinhVien sv: listSinhVien){
            if(sv.getMssv().equalsIgnoreCase(mssv)){
                return sv;
            }
        }
        return null;
    }
}
