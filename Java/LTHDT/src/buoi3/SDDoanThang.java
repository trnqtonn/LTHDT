package buoi3;
import buoi2.Diem;
public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Doan thang AB: ");
		AB.hienThi();
		AB.tinhTien(5, 3);
		DoanThang CD = new DoanThang();
		System.out.print("\nNhap doan thang CD: ");
		CD.nhap();
		System.out.println("Thong tin doan thang CD: ");
		CD.hienThi();
		System.out.print("\nDo dai doan thang CD: " + CD.doDai());
		System.out.print("\nGoc voi truc hoanh = " + CD.gocVoiTrucHoanh() + " do");
	}

}
