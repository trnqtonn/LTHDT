package destodocu;

import java.util.Scanner;

public class BDoc {
	private int msbd;
	private String tenbd, ngsinh;
	private boolean VIP;
	public BDoc() {
		msbd = 0;
		tenbd = new String();
		ngsinh = new String();
		VIP = true;
	}
	public BDoc(BDoc b) {
		msbd = b.msbd;
		tenbd = new String(b.tenbd);
		ngsinh = new String(b.ngsinh);
		VIP = b.VIP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so ban doc sach: ");
		msbd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten ban doc sach: ");
		tenbd = sc.nextLine();
		System.out.println("Nhap ngay sinh ban doc sach: ");
		ngsinh = sc.nextLine();
		System.out.println("Nhap ban doc lau nam: ");
		VIP = sc.nextBoolean();
	}
	public void in() {
		System.out.println("Ma so ban doc sach: " + msbd);
		System.out.println("Ten ban doc sach: " + tenbd);
		System.out.println("Ngay sinh ban doc sach: " + ngsinh);
		System.out.println("Ban doc lau nam: "+ VIP);
	}
	public int getMsbd() {
	    return msbd;
	}
	public String getTenBD() { 
		return tenbd; 
	}
	public static void main(String[] args) {
		BDoc bd1 = new BDoc();
		System.out.print("Nhap thong tin bd1\n");
		bd1.nhap();
		System.out.print("Thong tin bd2\n");
		bd1.in();
		BDoc bd2 = new BDoc(bd1);
		System.out.print("Thong tin bd1\n");
		bd2.in();
	}
}
