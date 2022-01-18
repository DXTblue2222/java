public class SinhVien {

    private String mssv;
    private String hoten;
    private String gioitinh;
    private int tuoi;
    private float diemtb;

    public SinhVien() {

    }

    public SinhVien(String mssv, String hoten, String gioitinh, int tuoi, float diemtb) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.diemtb = diemtb;
    }

    public String getmssv() {
        return mssv;
    }

    public void setmssv(String mssv) {
        this.mssv = mssv;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public String gethoten() {
        return hoten;
    }

    public void setgioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getgioitinh() {
        return gioitinh;
    }

    public void settuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int gettuoi() {
        return tuoi;
    }

    public void setdiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public float getdiemtb() {
        return diemtb;
    }
	
	public String toString() {
		return "[MSSV=" + this.mssv + ", Name=" + this.hoten + ", Gender=" + this.gioitinh + ", Age= " + this.tuoi + ", Score=" + this.diemtb;
	}
}