package buoi3;
import java.util.Scanner;
public class Gach {
	private String maso, mau;
	private int sl, cd, cn;
	private long gia;
	public Gach() {
		maso = new String();
		mau = new String();
		sl = 0;
		cd = 0;
		cn = 0;
		gia = 0;
	}
	public Gach(Gach g) {
		maso = new String(g.maso);
		mau = new String(g.mau);
		sl = g.sl;
		cd = g.cd;
		cn = g.cn;
		gia = g.gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maso=sc.nextLine();
		System.out.println("Nhap mau: ");
		mau=sc.nextLine();
		System.out.println("Nhap so luong vien gach: ");
		sl=sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		cd=sc.nextInt();
		System.out.println("Nhap chieu ngang: ");
		cn=sc.nextInt();
		System.out.println("Nhap gia: ");
		String s = sc.next();
		s = s.replace(".", "");
		gia = Long.parseLong(s);
	}
	public void hienthi() {
		System.out.println("Ma so: " + maso);
		System.out.println("Mau: " + mau);
		System.out.println("So luong: " + sl);
		System.out.println("Chieu dai: " + cd);
		System.out.println("Chieu ngang: " + cn);
		System.out.println("Gia: " + gia);
	}
	public String toString() {
		String s = new String();
		s += "Ma so: " + maso +"\n";
		s += "Mau: " + mau + "\n";
		s += "So luong:" + sl + "\n";
		s += "Chieu dai: " + cd + "\n";
		s += "Chieu ngang: " + cn + "\n";
		s += "Gia: " + gia + "\n";
		return s;
	}
	public float giaBanLe() {
		return(float)(gia * 1.2 / sl);
	}
	public float dienTichNen() {
        return (float)(sl * cd * cn) / 10000;
    }
	public int soLuongHop(int D, int N) {
		int sovienDoc = (D * 100)/cd;
		int sovienNgang = (N * 100)/cn;
		int tongVien = sovienDoc * sovienNgang;
		int soHop = tongVien / sl;
		if(tongVien % sl != 0) 
			soHop++;
		return soHop;
	}
	public float chiphimotmetvuong() {
		return (float)(gia / dienTichNen());
	}
	public long tongChiPhi(int D, int N) {
		 return (long)soLuongHop(D, N) * gia;
	}
}

