package destodocu;
import java.util.Scanner;
public class BNhan {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang;
	public BNhan() {
		hten = new String();
		gtinh = false; //false la female, true la male
		nsinh = 0;
		cnang = 0.0f;
	}
	public BNhan(BNhan bn) {
		hten = new String(bn.hten);
		gtinh = bn.gtinh;
		nsinh = bn.nsinh;
		cnang = bn.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten benh nhan: ");
		hten = sc.nextLine();
		System.out.println("Nhap gioi tinh benh nhan: ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh benh nhan: ");
		nsinh = sc.nextInt();
		System.out.println("Nhap can nang benh nhan: ");
		cnang = sc.nextFloat();
	}
	public void in() {
		System.out.println("Ho ten benh nhan: " + hten);
		System.out.println("Gioi tinh benh nhan: " + gtinh);
		System.out.println("Nam sinh benh nhan: " + nsinh);
		System.out.println("Can nang benh nhan: " + cnang);
	}
	public static void main(String[] args) {
		BNhan bn1 = new BNhan();
		System.out.print("Nhap thong tin benh nhan 1\n");
		bn1.nhap();
		System.out.print("Thong tin benh nhan 1\n");
		bn1.in();
		BNhan bn2 = new BNhan(bn1);
		System.out.print("Thong tin benh nhan 2\n");
		bn2.in();
	}
}
