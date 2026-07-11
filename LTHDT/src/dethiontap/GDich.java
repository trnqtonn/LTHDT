package dethiontap;
import java.util.Scanner;
public class GDich {
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = false;
	}
	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.ngay);
		tthai = gd.tthai;
	}
	 public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten nguoi giao dich: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay giao dich: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai giao dich: ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.println("Ma giao dich la: " + mgd);
		System.out.println("Ho ten nguoi giao dich: " + hten);
		System.out.println("Ngay gia dich: " + ngay);
		System.out.println("Trang thai giao dich: " + tthai);
	}
	public double thanhTien() {
	    return 0;
	}
	public String getNgay() {
	    return ngay;
	}
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		System.out.print("Nhap thong tin giao dich 1\n");
		gd1.nhap();
		System.out.print("Thong tin giao dich 1\n");
		gd1.in();
		GDich gd2 = new GDich(gd1);
		System.out.print("Thong tin giao dich 2\n");
		gd2.in();
	}
}
