package destodocu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TPham extends HHoa{
	private String ngaysx, hansd; //dd-mm-yyyy
	private char dd; // A, B, C, D, E
	public TPham() {
		super();
		ngaysx = new String();
		hansd = new String();
		dd = 'A';
	}
	public TPham(TPham t) {
		super((HHoa)t);
		ngaysx = new String(t.ngaysx);
		hansd = new String(t.hansd);
		dd = t.dd;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay san xuat: ");
		ngaysx = sc.nextLine();
		System.out.println("Nhap han su dung: ");
		hansd = sc.nextLine();
		System.out.println("Nhap ham luong dinh duong: ");
		dd = sc.next().charAt(0);
	}
	public void in() {
		super.in();
		System.out.println("Ngay san xuat: " + ngaysx);
		System.out.println("Han su dung: "+ hansd);
		System.out.println("Ham luong dinh duong: " + dd);
	}
	public char getDD() {
		return dd;
	}
	public String getHSD() {
		return hansd;
	}
	public static void main(String[] args) {
		HHoa ds[];
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = kb.nextInt();
		ds = new HHoa[n];
		int c;
		for(int i = 0; i< n; i++) {
			System.out.println("Ban muon chon HHoa(0) hay TPham(1)");
			c = kb.nextInt();
			if(c==0)
				ds[i] = new HHoa();
			else
				ds[i] = new TPham();
			System.out.println("\nNhap phan tu thu: " + (i+1));
			ds[i].nhap();
		}
		System.out.println("\n==== DANH SACH HANG HOA HOAC THUC PHAM ====");
		for(int i = 0; i< n; i++) {
			ds[i].in();
			System.out.println();
		}
		System.out.println("\n===== DANH SACH THUC PHAM GIA < 1000000 VA DD MUC A HOAC B =====");
		for(int i = 0; i < n; i++){
			if(ds[i].getDGia() < 1000000 && (ds[i].getDD() == 'A' || ds[i].getDD() == 'B')){
				System.out.println("\nTen thuc pham: "+ds[i].getTen());
			}
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ngayMoc = LocalDate.parse("21-11-2021", dtf);
		for (int i = 0; i < n; i++) {
		    if (ds[i] instanceof TPham) {
		        try {
		            LocalDate ngayHSD = LocalDate.parse(ds[i].getHSD(), dtf);
		            // Nếu HSD trước ngày mốc -> Tiến hành xóa bằng cách dồn mảng
		            if (ngayHSD.isBefore(ngayMoc)) {
		                System.out.println("-> Da xoa thuc pham het han: " + ds[i].getTen());
		                // Vòng lặp dồn các phần tử phía sau lên đè vào vị trí i
		                for (int j = i; j < n - 1; j++) {
		                    ds[j] = ds[j + 1];
		                }
		                ds[n - 1] = null; // Xóa bỏ liên kết ở ô cuối cùng
		                n--;              // Giảm số lượng phần tử thực tế của mảng đi 1
		                i--;              // LÙI i lại 1 bước để kiểm tra phần tử mới vừa bị dồn lên vị trí i
		            }
		        } catch (Exception e) {
		            System.out.println("Loi dinh dang ngay tai: " + ds[i].getTen());
		        }
		    }
		}
	}
}
