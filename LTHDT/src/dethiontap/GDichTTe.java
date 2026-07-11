package dethiontap;
import java.util.Scanner;
public class GDichTTe extends GDich{
	private float dgia;
	private int sluong;
	private float tgia;
	private char loai;
	public GDichTTe() {
		super();
		sluong = 0;
		dgia = 0.0f;
		tgia = 0.0f;
		loai = 'V';
	}
	public GDichTTe(GDichTTe gt) {
		super((GDich)gt);
		sluong = gt.sluong;
		dgia = gt.dgia;
		tgia = gt.tgia;
		loai = gt.loai;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.println("Nhap ti gia: ");
		tgia = sc.nextFloat();
		System.out.println("Nhap loai: ");
		loai = sc.next().charAt(0);
	}
	public double thanhTien() {
        if (loai == 'V' || loai == 'v')
            return dgia * sluong;
        else
            return dgia * sluong * tgia;
    }
	 public void in() {
		super.in();
		System.out.println("Don gia: " + dgia);
        System.out.println("So luong: " + sluong);
        System.out.println("Loai tien: " + loai);
        System.out.println("Ty gia: " + tgia);
        System.out.println("Thanh tien: " + thanhTien());
	}
	public static void main(String[] args) {
		GDich ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = sc.nextInt();
		ds = new GDich[n];
		int c;
		for(int i = 0; i < n; i++) {
			System.out.println("Ban chon GDich(0) hay GDichTTe(1)");
			c = sc.nextInt();
			if(c == 0)
				ds[i] = new GDich();
			else
				ds[i] = new GDichTTe();
			System.out.println("\nNhap giao dich thu " + (i + 1));
			ds[i].nhap();
		}
		System.out.println("\n===== DANH SACH GIAO DICH =====");
        for (int i = 0; i < n; i++) {
            ds[i].in();
            System.out.println();
        }
        System.out.println("===== GIAO DICH >100.000.000 =====");
        for (int i = 0; i < n; i++) {
            if (ds[i].thanhTien() > 100000000) {
                ds[i].in();
                System.out.println();
            }
        }
        sc.nextLine();
        System.out.print("Nhap thang/nam can thong ke (MM/yyyy): ");
        String thangNam = sc.nextLine();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getNgay().substring(3).equals(thangNam)) {
                tong += ds[i].thanhTien();
            }
        }
        System.out.println("Tong tien giao dich trong " + thangNam + " la: " + tong);
	}
}
