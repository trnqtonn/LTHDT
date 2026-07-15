package destodocu;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BNCovid extends BNhan{
	private char loai;
	private String ngay, odich, noi;
	public BNCovid(){
		super();
		loai = '0'; // loai 0 la F0, 1 la F1, 2 la F2
		ngay = new String();
		odich = new String();
		noi = new String();
	}
	public BNCovid(BNCovid v) {
		super((BNhan)v);
		loai = v.loai;
		ngay = new String(v.ngay);
		odich = new String(v.odich);
		noi = new String(v.noi);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai nguoi benh: ");
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap ngay, thang, nam cach ly: ");
		ngay = sc.nextLine();
		System.out.println("Nhap o dich: ");
		odich = sc.nextLine();
		System.out.println("Nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Loai nguoi benh: " + loai);
		System.out.println("Ngay, thang, nam cach ly: " + ngay);
		System.out.println("O dich: " + odich);
		System.out.println("Noi cach ly: " + noi);
	}
	public char getLoai() {
	    return loai;
	}
	public String getODich() {
	    return odich;
	}
	public String getNgay() {
	    return ngay;
	}
	public static void main(String[] args) {
		BNhan ds[];
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ds = new BNhan[n];
		int c;
		for(int i = 9; i < n; i++) {
			System.out.println("Ban cho BNhan(0) hay BNCovid(1)");
			c = kb.nextInt();
			if(c==0)
				ds[i] = new BNhan();
			else
				ds[i] = new BNCovid();
			System.out.println("\nNhap benh nhan thu " + (i + 1));
			ds[i].nhap();
		}
		System.out.println("\n===== DANH SACH BENH NHAN =====");
        for (int i = 0; i < n; i++) {
            ds[i].in();
            System.out.println();
        }
        System.out.println("\nDanh sach benh nhan F1 tai o dich Cong ty HODIDEN:");
        for (int i = 0; i < n; i++) {
            if (ds[i] instanceof BNCovid) {
                BNCovid bn = (BNCovid) ds[i];
                if (bn.getLoai() == '1' && bn.getODich().equalsIgnoreCase("Cong ty HODIDEN")) {
                    bn.in();
                    System.out.println();
                }
            }
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate moc = LocalDate.of(2021, 5, 18);
        System.out.println("Danh sach benh nhan COVID da het thoi gian cach ly:");
        for (int i = 0; i < n; i++) {
            if (ds[i] instanceof BNCovid) {
                BNCovid bn = (BNCovid) ds[i];
                LocalDate ngayCL = LocalDate.parse(bn.getNgay(), f);
                if (!ngayCL.plusDays(14).isAfter(moc)) {
                    bn.in();
                    System.out.println();
                }
            }
        }
	}
}
