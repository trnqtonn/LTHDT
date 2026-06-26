package buoi2;
import java.util.Scanner;
public class Diem {
	private int x, y;
	public Diem() {
		x = 0;
		y = 0;
	}
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Diem(int n) {
		x = n;
		y = n;
	}
	public Diem(Diem d) {
	    x = d.x;
	    y = d.y;
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap x = ");
		x=sc.nextInt();
		System.out.print("Nhap y = ");
		y=sc.nextInt();
	}
	public void hienThi() {
        System.out.println("(" + x + "," + y + ")");
    }
	public void hienthi(String S) {
		System.out.print(S);
		hienThi();
	}
	public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }
	public String toString() {
		return("(" + x + "," + y + ")");
	}
	public void gan(int x1, int y1) {
		x = x1;
		y = y1;
	}
    public int giaTriX() {
        return x;
    }
    public int giaTriY() {
        return y;
    }
    public float khoangCach() {
        return (float)Math.sqrt(x * x + y * y);
    }
    public float khoangCach(Diem d) {
        return (float)Math.sqrt((x - d.x) * (x - d.x)+ (y - d.y) * (y - d.y));
    }
}
