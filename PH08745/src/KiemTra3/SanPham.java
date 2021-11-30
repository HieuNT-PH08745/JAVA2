package KiemTra3;

import java.io.Serializable;

/**
 *
 * @author Trung Hieu
 */
public class SanPham implements Serializable {
    private String tenSP;
    
    private String maSP;
    
    private double donGia;
    
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String tenSP, String maSP, double donGia, String danhMuc) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.donGia = donGia;
        this.danhMuc = danhMuc;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    
}
