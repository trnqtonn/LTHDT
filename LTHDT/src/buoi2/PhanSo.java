package buoi2;
import java.util.Scanner;
public class PhanSo {
	private int tu, mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tu1, int mau1) {
		tu = tu1;
		if(mau1 == 0)
			mau = 1;
		else
			mau = mau1;
		rutGon();
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu so: ");
		tu = sc.nextInt();
		do {
			System.out.print("Nhap mau so: ");
			mau = sc.nextInt();
			if(mau == 0)
				System.out.print("Mau khong the bang 0. Nhap lai!");
		}while(mau == 0);
	}
	public void in() {
		if(tu == 0)
			System.out.print("0");
		else if (mau == 1)
			System.out.print(tu);
		else
			System.out.print(tu + "/" + mau);
	}
	public String toString() {
		if(tu == 0)
			return "0";
		else if (mau == 1)
			return "" + tu;
		else
			return (tu + "/" + mau);
	}
	private int UCLN(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;	
		}
		return a;
	}
	private void rutGon() {
		int u = UCLN(tu, mau);
		if(u != 0) {
			tu = tu / u;
			mau = mau / u;
		}
		if(mau < 0) {
			tu = -tu;
			mau = - mau;
		}
	}
	public void nghicDao() {
		int temp = tu;
		tu = mau;
		mau = temp;
	}
	public PhanSo giaTriNghichDao() {
		return new PhanSo(mau, tu);
	}
	public double giatriThuc() {
		return (double)tu/mau;
	}
	public boolean lonHon(PhanSo a) {
		return tu * a.mau > a.tu * mau;
	}
	public PhanSo cong(PhanSo a) { 
		return new PhanSo( tu * a.mau + a.tu * mau, mau * a.mau ); 
	} 
	public PhanSo tru(PhanSo a) { 
		return new PhanSo( tu * a.mau - a.tu * mau, mau * a.mau ); 
	} 
	public PhanSo nhan(PhanSo a) { 
		return new PhanSo( tu * a.tu, mau * a.mau ); 
	} public PhanSo chia(PhanSo a) { 
		return new PhanSo( tu * a.mau, mau * a.tu ); 
	} 
	public PhanSo cong(int n) { 
		return new PhanSo(tu + n * mau, mau); 
	} public PhanSo tru(int n) { 
		return new PhanSo(tu - n * mau, mau); 
	} public PhanSo nhan(int n) { 
		return new PhanSo(tu * n, mau); 
	} public PhanSo chia(int n) { 
		return new PhanSo(tu, mau * n); 
	}
}
