package buoi3;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		a.nhapThongTin();
		a.nhapDiem();
		a.dangKyThem("LTHDT");
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new SinhVien();
			ds[i].nhapThongTin();
			ds[i].nhapDiem();
		}
		System.out.println("\nSinh vien bi canh cao hoc vu:");
		for(int i = 0; i < n; i++)
			if(ds[i].diemTB() <1.0) {
				System.out.println(ds[i]);
			}else
				System.out.print("Khong co sinh vien nao");
		SinhVien max = ds[0];
		for(int i = 0; i < n; i++)
			if(ds[i].diemTB() > max.diemTB())
				max = ds[i];
		System.out.println("\nSinh vien co DTB cao nhat:");
		System.out.println(max);
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1; j < n; j++)
				if(ds[i].layTen().compareToIgnoreCase(ds[j].layTen()) > 0) {
					SinhVien tg = ds[i];
					ds[i] = ds[j];
					ds[j] = tg;
				}
		System.out.println("\nDanh sach sau khi sap xep:");
		for(int i = 0; i < n; i++)
			System.out.println(ds[i]);
	}
}
