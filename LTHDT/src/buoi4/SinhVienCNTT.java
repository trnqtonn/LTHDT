package buoi4;
import java.util.Scanner;
import buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien{
	private String tKhoan, mKhau, email;
	public SinhVienCNTT() {
		super();
		tKhoan = new String();
		mKhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super((SinhVien)sv);
		tKhoan = new String(sv.tKhoan);
		mKhau = new String(sv.mKhau);
		email = new String(sv.email);
	}
	public void nhap() {
		super.nhapThongTin();
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khoan: ");
		tKhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		mKhau = sc.nextLine();
		System.out.print("Nhap dia chi email: ");
		email = sc.nextLine();
	}
	public String toString() {
		return super.toString() + "tai khoan: " + tKhoan + " voi mat khau: " + mKhau + " va email la: " + email;
	}
	public void doiMatKhau(String newpass) {
	    mKhau = newpass;
	}
	public String getEmail() {
	    return email;
	}
	public String getTaiKhoan() {
	    return tKhoan;
	}
}

