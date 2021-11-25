package Luyentap1;

import java.io.Serializable;

/**
 *
 * @author Trung Hieu
 */
public class SinhVien implements Serializable {
    
    private String hoTen;
    
    private String maSV;
    
    private String diaChi;
    
    private String nganh;
    
    private int gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, String diaChi, String nganh, int gioiTinh) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diaChi = diaChi;
        this.nganh = nganh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    
}
