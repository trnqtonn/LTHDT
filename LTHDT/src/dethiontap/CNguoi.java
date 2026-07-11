package dethiontap;
import java.util.Scanner;
public class CNguoi {
	private String id, hten, ngay;
	private char phai;
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so id: ");
		id = sc.nextLine();
		System.out.println("Nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		ngay = sc.nextLine();
		System.out.println("Nhap phai: ");
		phai = sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("So ID: " + id);
		System.out.println("Ho va Ten: " + hten);
		System.out.println("Ngay, thang, nam sinh: " + ngay);
		System.out.println("Gioi tinh: " + phai);
	}
	public long tinhLuong() {
	    return 0;
	}
	public String getFullName(){
		return hten;
	}
	public int getAge() {
	    String nam = ngay.substring(ngay.lastIndexOf("/") + 1);
	    return 2026 - Integer.parseInt(nam);
	}
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.print("Nhap thong tin con nguoi1\n");
		c1.nhap();
		System.out.print("Thong tin con nguoi1\n");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.print("Thong tin con nguoi2\n");
		c2.in();
	}
}
