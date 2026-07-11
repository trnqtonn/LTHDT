package buoi2;
public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		System.out.print("Diem A: ");
		A.hienThi();
		Diem B = new Diem();
		System.out.println("Nhap diem B:");
		B.nhapDiem();
		System.out.print("Diem B: ");
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("Diem C: ");
		C.hienThi();
		System.out.println("Khoang cach tu B den O = " + B.khoangCach());
		System.out.println("Khoang cach tu A den B = " + A.khoangCach(B));
		System.out.println("Khoảng cách doan thang AB =" + (A.khoangCach(B)/2));
		int tx = (A.giaTriX() + B.giaTriX()) / 2;
		int ty = (A.giaTriY() + B.giaTriY()) / 2;
		Diem M = new Diem(tx, ty);
		System.out.print("Trung diem AB: ");
		M.hienThi();
		
	}
}
