package dethiontap;
import java.util.Scanner;
public class ChuyenXe {
	private int msc;
	private String tentx, nden;
	private float dthu;
	private Xe xe;
	public ChuyenXe() {
		xe = new Xe();
		msc = 0;
		tentx = new String();
		nden = new String();
		dthu = 0.0f;
	}
	public ChuyenXe(ChuyenXe cx) {
		xe = new Xe(cx.xe);
		msc = cx.msc;
		tentx = new String(cx.tentx);
		nden = new String(cx.nden);
		dthu = cx.dthu;
	}
	public void nhapXe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin xe: ");
		xe.nhap();
		System.out.println("Nhap ma so chuyen xe: ");
		msc = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Nhap ten tai xe: ");
		tentx = sc.nextLine();
		System.out.println("Nhap noi den: ");
		nden = sc.nextLine();
		System.out.println("Nhap danh thu: ");
		dthu = sc.nextFloat();
		sc.nextLine();
	}
	public void inXe() {
		xe.in();
		System.out.println("Ma so chuyen xe: " + msc);
		System.out.println("Ten tai xe: " + tentx);
		System.out.println("Noi den: " + nden);
		System.out.println("Doanh thu: " + dthu);
	}
	public float loiNhuan() {
	    return dthu * 0.3f;
	}
	public int getMSC() {
	    return msc;
	}
	public Xe getXe() {
	    return xe;
	}
	public float getDoanhThu() {
	    return dthu;
	}
	public static void main(String[] args) {
		ChuyenXe ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		sc.nextLine();
		ds = new ChuyenXe[n];
		for(int i = 0; i < n; i++) {
			System.out.println("So phan tu thu " + (i+1) + ": ");
			ds[i] = new ChuyenXe();
			ds[i].nhapXe();
		}
		System.out.println("\n===== DANH SACH CHUYEN XE =====");
        for (int i = 0; i < n; i++) {
            ds[i].inXe();
            System.out.println();
        }
        System.out.println("Loi nhuan cua tung chuyen xe:");
        for(int i = 0; i < n; i++) {
            System.out.println("Chuyen xe " + ds[i].getMSC() + ": " + ds[i].loiNhuan());
        }
        System.out.println("\nMa so cac chuyen xe bi huy hoac doanh thu < 100000:");
        for(int i = 0; i < n; i++) {
            if(ds[i].getXe().getTrangThai() == 'K' || ds[i].getDoanhThu() < 100000) {
                System.out.println(ds[i].getMSC());
            }
        }
        sc.nextLine();
        System.out.print("Nhap thang/nam can thong ke (MM/yyyy): ");
        String thangNam = sc.nextLine();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].getXe().getNgay().substring(3).equals(thangNam)) {
                tong += ds[i].loiNhuan();
            }
        }
        System.out.println("Tong tien giao dich trong " + thangNam + " la: " + tong);
	}
}
