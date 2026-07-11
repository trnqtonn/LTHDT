package buoi3;
import java.util.Scanner;
import buoi2.Date;
public class SinhVien {
	private String mssv, hoTen;
	private Date ngaySinh;
	private int soHP;
	private String[] tenHP;
	private String[] diem;
	public SinhVien() {
		mssv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soHP = 0;
		tenHP = new String[0];
		diem = new String[0];
	}
	public SinhVien(SinhVien s) {
		mssv = new String(s.mssv);
		hoTen = new String(s.hoTen);
		ngaySinh = new Date(s.ngaySinh);
		soHP = s.soHP;
		tenHP = new String[0];
		diem = new String[0];
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("MSSV: ");
		mssv = sc.nextLine();
		System.out.print("Ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Ngay sinh: ");
		ngaySinh.nhap();
		System.out.print("So luong hoc phan: ");
		soHP = sc.nextInt();
		sc.nextLine();
		tenHP = new String[soHP];
		diem = new String[soHP];
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < soHP; i++) {
			System.out.print("Ten hoc phan: ");
			tenHP[i] = sc.nextLine();
			System.out.print("Diem (A, B+, B,...): ");
			diem[i] = sc.nextLine();
		}
	}
	private double quyDoi(String d) {
        switch(d.toUpperCase()) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D+": return 1.5;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
	public String toString() {
		String s = new String();
		s += "MSSV: " + mssv + "\n";
        s += "Ho ten: " + hoTen + "\n";
        s += "Ngay sinh: " + ngaySinh + "\n";
        for(int i = 0; i < soHP; i++)
            s += tenHP[i] + " : " + diem[i] + "\n";
        s += "DTB = " + diemTB() + "\n";
        return s;
	}
	public double diemTB() {
		if(soHP == 0) return 0;
		double tong = 0;
		for(int i = 0; i < soHP; i++)
			tong += quyDoi(diem[i]);
		return tong / soHP;
	}
	public void dangKyThem(String hp) {
        String[] tenMoi = new String[soHP + 1];
        String[] diemMoi = new String[soHP + 1];
        for(int i = 0; i < soHP; i++) {
        	tenMoi[i] = tenHP[i];
        	diemMoi[i] = diem[i];
        }
        tenMoi[soHP] = hp;
        diemMoi[soHP] = new String();
        tenHP = tenMoi;
        diem = diemMoi;
        soHP++;
	}
	public void xoaHocPhan(String hp) {
		int vt = -1;
		for(int i = 0; i < soHP; i++)
			if(tenHP[i].equalsIgnoreCase(hp))
				vt = i;
		if(vt == -1)return;
		String[] tenMoi = new String[soHP - 1];
        String[] diemMoi = new String[soHP - 1];
        int j = 0;
        for(int i = 0; i < soHP; i++) {
            if(i != vt) {
                tenMoi[j] = tenHP[i];
                diemMoi[j] = diem[i];
                j++;
            }
        }
        tenHP = tenMoi;
        diem = diemMoi;
        soHP--;
	}
	public String layTen() {
        String[] t = hoTen.trim().split("\\s+");
        return t[t.length - 1];
    }

}
