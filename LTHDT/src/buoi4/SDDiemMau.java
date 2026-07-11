package buoi4;
public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "Trang");
		System.out.println("Thong tin diem A: ");
		A.in();
		DiemMau B = new DiemMau();
		System.out.println("\nNhap thong tin diem B: ");
		B.nhap();
		B.doiDiem(10, 8);
		System.out.println("\nThong tin diem B khi doi diem: ");
		B.in();
		B.GanMau("Vang");
		System.out.println("\nThong tin diem B gan mau: ");
		B.in();
	}
}
