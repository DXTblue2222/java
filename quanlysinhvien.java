import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
 
public class quanlysinhvien {
    public static Scanner scanner = new Scanner(System.in);
    private ArrayList<SinhVien> danhsachsinhvien;
    private sinhvienfile sinhvienfile;
  
    public quanlysinhvien() {
        sinhvienfile = new sinhvienfile();
        danhsachsinhvien = sinhvienfile.read();
    }
 
    //Themsinhvien

    public void themsv() {
        System.out.println("Nhap vao ma so sinh vien  ");
        String hoten = scanner.nextLine();
		System.out.println("Nhap vao ho ten sinh vien  ");
        String gioitinh = scanner.nextLine();
		System.out.println("Nhap vao gioi tinh sinh vien  ");
        String mssv = scanner.nextLine();
		System.out.println("Nhap vao tuoi sinh vien  ");
        int tuoi = scanner.nextInt();
		System.out.println("Nhap vao diem sinh vien  ");
        float diemtb = scanner.nextFloat();
        SinhVien sinhvien = new SinhVien(mssv, hoten, gioitinh, tuoi, diemtb);
        danhsachsinhvien.add(sinhvien);
        sinhvienfile.write(danhsachsinhvien);
    }
 
    //Xoasinhvien

    public void xoasv() {
		System.out.println("Nhap ma so sinh vien cua sinh vien can tim: ");
        String mssv = scanner.nextLine();
        SinhVien sinhvien = null;
        int size = danhsachsinhvien.size();
        for (int i = 0; i < size; i++) {
            if (danhsachsinhvien.get(i).getmssv().equals(mssv) ){
                sinhvien = danhsachsinhvien.get(i);
                break;
            }
        }
        if (sinhvien != null) {
            danhsachsinhvien.remove(sinhvien);
            sinhvienfile.write(danhsachsinhvien);
        } else {
            System.out.printf("Ma so sinh vien = "+mssv+" khong ton tai.\n");
        }
    }

    //Timkiemsinhvien
    public void timkiemsv() {
        System.out.println("Nhap ma so sinh vien cua sinh vien can tim: ");
        String mssv = scanner.nextLine();
        
        boolean timkiem = false;
        for (SinhVien sinhvien : danhsachsinhvien) {
            if(sinhvien.getmssv().equals(mssv)) {
                sinhvien.toString();
                timkiem = true;
                break;
            }
        }
        if(!timkiem){
           System.out.println("Khong tim thay sinh vien voi mssv =" + mssv) ;
        }
    }
  
}
