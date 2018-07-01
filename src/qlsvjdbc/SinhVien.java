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
public class SinhVien {
    private static int maHienTai=0;
    private int ma;
    private String ten;
    private LocalDate ngaySinh;

    public SinhVien(int ma, String ten, LocalDate ngaySinh) {
        this.ma = maHienTai++;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public SinhVien() {
        this.ma=maHienTai++;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public LocalDate NhapNgaySinh(){
        // can them try-catch de gioi han ngay thang chuan duoc nhap vao
        System.out.println("Nhap ngay sinh: ");
        System.out.print("Ngay: ");
        int ngay = new Scanner(System.in).nextInt();
        System.out.print("Thang: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.print("Nam: ");
        int nam = new Scanner(System.in).nextInt();
        LocalDate ngaySinh = LocalDate.of(nam, thang, ngay);
        return ngaySinh;
    }
    
}
