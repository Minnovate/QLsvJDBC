/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsvjdbc;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author gamelord
 */
public class QuanLySinhVien implements ISinhVien {

        
    @Override
    public void NhapThongTinSinhVien(SinhVien sv) {
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.print("Ma: "+sv.getMa());
        System.out.print("Ten: ");
        sv.setTen(new Scanner(System.in).nextLine());
        sv.setNgaySinh(sv.NhapNgaySinh());
    }

    @Override
    public void HienThongTinSinhVien(SinhVien sv) {
        System.out.println("Ma: "+sv.getMa());
        System.out.println("Ten: "+sv.getTen());
        System.out.println("Ngay sinh: "+sv.getNgaySinh());
        System.out.println("********************************");
    }
    
}
