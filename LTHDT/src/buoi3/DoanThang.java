package buoi3;
import java.util.Scanner;
import buoi2.Diem;
public class DoanThang {
	private Diem d1, d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public DoanThang(int  ax, int  ay,  int  bx,  int  by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	public void nhap() {
		System.out.print("\nNhap diem dau: ");
		d1.nhapDiem();
		System.out.print("Nhap diem cuoi: ");
		d2.nhapDiem();
	}
	public void hienThi() {
		System.out.print("D1 = " + d1);
		System.out.print("\nD2 = " + d2);
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public double gocVoiTrucHoanh() {
        int dx = d2.giaTriX() - d1.giaTriX();
        int dy = d2.giaTriY() - d1.giaTriY();
        return Math.toDegrees(Math.atan2(dy, dx));
	}
}
