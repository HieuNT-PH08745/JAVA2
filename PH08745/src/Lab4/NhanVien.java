package Lab4;

import java.util.Date;

/**
 *
 * @author os_cntt_gpdn25
 */
public class NhanVien {
 
    private String hoTen;
    
    private Date ngaySinh;
    
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, Date ngaySinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
    
}
