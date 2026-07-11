package dethiontap;
import java.util.Scanner;
public class CThu extends CNguoi{
	private int so;
	private String vtri;
	private long bthang;
	private String clbo;
	public CThu() {
		super();
		so = 0;
		vtri = new String();
		clbo = new String();
		bthang = 0;
	}
	public CThu(CThu ct) {
		super((CNguoi)ct);
		so = ct.so;
		bthang = ct.bthang;
		vtri = new String(ct.vtri);
		clbo = new String(ct.clbo);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ao cau thu: ");
		so = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vi tri cua cau thu: ");
		vtri = sc.nextLine();
		System.out.println("Nhap so ban thang cua cau thu: ");
		bthang = sc.nextLong();
		sc.nextLine();
		System.out.println("Nhap cau lac bo cua cau thu dang da: ");
		clbo = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("So ao cau thu: " + so);
		System.out.println("Vi tri cua cau thu: " + vtri);
		System.out.println("So ban thang cua cau thu: " + bthang);
		System.out.println("Cau lac bo cua cau thu dang da: " + clbo);
	}
	public long tinhLuong() {
		long luongcoban = 7000000;
		long luongthuong = bthang * 500000;
		long luongtangthem = 0;
		switch(vtri.toLowerCase()) {
		case "thu mon": luongtangthem = 3000000;
		break;
		case "hau ve": luongtangthem = 4000000;
		break;
		case "trung ve": luongtangthem = 4500000;
		break;
		case "tien ve": luongtangthem = 5000000;
		break;
		case "tien dao": luongtangthem = 7000000;
		break;
		default:
			luongtangthem = 0;
			break;
		}
		long tienluong = luongcoban + luongthuong + luongtangthem;
		long tienluongchinh = tienluong * 9/10;
		return tienluongchinh;
	}
	public String getCLB() {
	    return clbo;
	}
	public long getBanThang() {
	    return bthang;
	}
	public static void main(String[] args) {
		CNguoi ds[];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new CNguoi[n];
		int c;
		for(int i = 0; i < n; i++) {
			System.out.println("Ban chon CNguoi(0) hay CThu(1):");
			c = sc.nextInt();
			if(c==0)
				ds[i] = new CNguoi();
			else
				ds[i] = new CThu();
			System.out.println("\nNhap cau thu thu " + (i + 1));
			ds[i].nhap();
		}
		System.out.println("\n===== DANH SACH CAU THU =====");
        for (int i = 0; i < n; i++) {
            ds[i].in();
            System.out.println();
        }
        System.out.println("\n===== DANH SACH TIEN LUONG CAU THU =====");
        for(int i = 0; i < n; i++){
			if(ds[i].tinhLuong() != 0){
				System.out.println("\nTien luong cau thu "+ds[i].getFullName() + ": "+ds[i].tinhLuong());
			}
		}
        sc.nextLine();
        System.out.print("Nhap ten CLB can thong ke: ");
        String tenCLB = sc.nextLine();
        long bt1824 = 0;
        long bt2528 = 0;
        long bt28 = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i] instanceof CThu) {
                CThu ct = (CThu) ds[i];
                if (ct.getCLB().equalsIgnoreCase(tenCLB)) {
                    int tuoi = ct.getAge();
                    if (tuoi >= 18 && tuoi <= 24)
                        bt1824 += ct.getBanThang();
                    else if (tuoi >= 25 && tuoi <= 28)
                        bt2528 += ct.getBanThang();
                    else if (tuoi > 28)
                        bt28 += ct.getBanThang();
                }
            }
        }
        System.out.println("\nThong ke ban thang cua CLB " + tenCLB);
        System.out.println("18 - 24 tuoi: " + bt1824);
        System.out.println("25 - 28 tuoi: " + bt2528);
        System.out.println("> 28 tuoi: " + bt28);
	}
}
