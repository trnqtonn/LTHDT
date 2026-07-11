package dethiontap;
import java.util.Scanner;
public class Xe {
	private String soxe, loai, ngay;
	private char tthai;
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'K';
	}
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap bang so xe: ");
		soxe = sc.nextLine();
		System.out.println("Nhap loai xe(Vios, City,...): ");
		loai = sc.nextLine();
		System.out.println("Nhap ngay, thang, nam dang kiem: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai luu hanh: ");
		tthai = sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("Bang so xe: " + soxe);
		System.out.println("Loai xe(Vios, City,...): " + loai);
		System.out.println("Ngay, thang, nam dang kiem: " + ngay);
		System.out.println("Trang thai luu hanh: " + tthai);
	}
	public char getTrangThai() {
	    return tthai;
	}
	public String getNgay() {
	    return ngay;
	}
	public static void main(String[] args) {
		Xe x1 = new Xe();
		System.out.print("Nhap thong tin xe 1\n");
		x1.nhap();
		System.out.print("Thong tin xe 1\n");
		x1.in();
		Xe x2 = new Xe(x1);
		System.out.print("Thong tin xe 2\n");
		x2.in();
	}
}
