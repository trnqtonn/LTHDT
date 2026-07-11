package buoi2;
import java.util.Scanner;
public class SDPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.println("Phan So a = " +a);
		System.out.println("Phan So a = " +b);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Phan So x la " );
		x.nhap();
		System.out.println("Phan So y la " );
		y.nhap();
		System.out.println("Phan So x = " +x);
		System.out.println("Phan So y = " +y);
		System.out.println("Nghich dao cua phan so x = " +x.giaTriNghichDao());
		System.out.println("Tong cua x + y = " +x.cong(y));
		System.out.print("\nNhap n = "); 
		int n = sc.nextInt(); 
		PhanSo ds[] = new PhanSo[n]; 
		for (int i = 0; i < n; i++) { 
			ds[i] = new PhanSo(); 
			System.out.println( "Nhap phan so thu " + (i + 1) + ":"); 
			ds[i].nhap(); 
		} 
		PhanSo tong = new PhanSo(); 
		for (int i = 0; i < n; i++) 
			tong = tong.cong(ds[i]); 
		System.out.println("Tong danh sach = " + tong); 
		PhanSo max = ds[0]; 
		for (int i = 1; i < n; i++) 
			if (ds[i].lonHon(max)) 
				max = ds[i]; 
		System.out.println("Phan so lon nhat = " + max); 
		for (int i = 0; i < n - 1; i++) 
			for (int j = i + 1; j < n; j++) 
				if (ds[i].lonHon(ds[j])) { 
					PhanSo t = ds[i]; 
					ds[i] = ds[j]; 
					ds[j] = t; 
				} 
		System.out.println("Danh sach tang dan:"); 
		for (int i = 0; i < n; i++) 
			System.out.println(ds[i]); 
	}
}
