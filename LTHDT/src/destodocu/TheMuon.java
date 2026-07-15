package destodocu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TheMuon {
	private int mst;
	private String nmuon, ntra;
	private BDoc bdoc;
	public TheMuon() {
		bdoc = new BDoc();
		mst = 0;
		nmuon = new String();
		ntra = new String();
	}
	public TheMuon(TheMuon t) {
		bdoc = new BDoc(t.bdoc);
		mst = t.mst;
		nmuon = new String(t.nmuon);
		ntra = new String(t.ntra);
	}
	public void nhapT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin ban doc: ");
		bdoc.nhap();
		System.out.println("Nhap ma so the: ");
		mst = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ngay muon sach: ");
		nmuon = sc.nextLine();
		System.out.println("Nhap ngay tra sach: ");
		ntra = sc.nextLine();
	}
	public void inT() {
		bdoc.in();
		System.out.println("Ma so the: " + mst);
		System.out.println("Ngay muon sach: " + nmuon);
		System.out.println("Ngay tra sach: " + ntra);
	}
	public BDoc getBDoc() {
	    return bdoc;
	}
	public static void main(String[] args) {
		TheMuon ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		sc.nextLine();
		ds = new TheMuon[n];
		for(int i = 0; i < n; i++) {
			System.out.println("So phan tu thu " + (i+1) + ": ");
			ds[i] = new TheMuon();
			ds[i].nhapT();
		}
		System.out.println("\n===== DANH SACH THE MUON =====");
        for (int i = 0; i < n; i++) {
            ds[i].inT();
            System.out.println();
        }
        System.out.println("\n===== MÃ SỐ BẠN ĐỌC MƯỢN SÁCH HƠN 36 NGÀY =====");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (int i = 0; i < n; i++) {
            // 1. Đổi chuỗi ngày mượn/trả sang kiểu Ngày (LocalDate)
            LocalDate ngayMuon = LocalDate.parse(ds[i].nmuon, dtf);
            LocalDate ngayTra = LocalDate.parse(ds[i].ntra, dtf);
            // 2. Tính số ngày chênh lệch
            long soNgayMuon = ChronoUnit.DAYS.between(ngayMuon, ngayTra);
            // 3. Nếu lớn hơn 36 ngày thì in mã số bạn đọc ra
            if (soNgayMuon > 36) {
                System.out.println("- Mã số bạn đọc: " + ds[i].getBDoc().getMsbd() + " (Đã mượn: " + soNgayMuon + " ngày)");
            }
        }
        long maxNgay = -1;
        // Bước 1: Tìm ra số ngày mượn lớn nhất (max) trong danh sách
        for (int i = 0; i < n; i++) {
            LocalDate ngayMuon = LocalDate.parse(ds[i].nmuon, dtf);
            LocalDate ngayTra = LocalDate.parse(ds[i].ntra, dtf);
            long soNgay = ChronoUnit.DAYS.between(ngayMuon, ngayTra);
            if (soNgay > maxNgay) {
                maxNgay = soNgay;
            }
        }
        // Bước 2: Duyệt lại và in ra tất cả những ai có số ngày mượn bằng đúng maxNgay
        System.out.println("\n===== BẠN ĐỌC CÓ SỐ NGÀY MƯỢN LÂU NHẤT (" + maxNgay + " ngày) =====");
        for (int i = 0; i < n; i++) {
            LocalDate ngayMuon = LocalDate.parse(ds[i].nmuon, dtf);
            LocalDate ngayTra = LocalDate.parse(ds[i].ntra, dtf);
            long soNgay = ChronoUnit.DAYS.between(ngayMuon, ngayTra);
            if (soNgay == maxNgay) {
                System.out.println("- Tên bạn đọc: " + ds[i].getBDoc().getTenBD());
            }
        }
	}
}
