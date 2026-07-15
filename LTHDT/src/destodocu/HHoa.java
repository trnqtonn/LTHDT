package destodocu;

import java.util.Scanner;

public class HHoa {
	private int mhh, slg;
	private float dgia;
	private String ten;
	public HHoa() {
		mhh = 0;
		ten = new String();
		dgia = 0.0f;
		slg = 0;
	}
	public HHoa(HHoa h) {
		mhh = h.mhh;
		ten = new String(h.ten);
		dgia = h.dgia;
		slg = h.slg;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma hang hoa: ");
		mhh = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.println("Nhap so luong hang hoa: ");
		slg = sc.nextInt();
	}
	public void in() {
		System.out.println("Ma hang hoa: " + mhh);
		System.out.println("Ten hang hoa: " + ten);
		System.out.println("Don gia: " + dgia);
		System.out.println("So luong hang hoa: " + slg);
	}
	public float getDGia() {
		return dgia;
	}
	public String getTen() {
		return ten;
	}
	public char getDD() {
		return ' ';
	}
	public String getHSD() {
	    return ""; 
	}
	public static void main(String[] args) {
		HHoa hh1 = new HHoa();
		System.out.print("Nhap thong tin hh1\n");
		hh1.nhap();
		System.out.print("Thong tin hh1\n");
		hh1.in();
		HHoa hh2 = new HHoa(hh1);
		System.out.print("Thong tin hh2\n");
		hh2.in();
	}
}
