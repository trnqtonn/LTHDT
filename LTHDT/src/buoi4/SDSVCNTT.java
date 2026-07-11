package buoi4;
import java.util.Scanner;
public class SDSVCNTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVienCNTT[] ds = new SinhVienCNTT[n];
        for(int i = 0; i < n; i++) {
            System.out.println("\n===== Sinh vien thu " + (i + 1) + " =====");
            ds[i] = new SinhVienCNTT();
            ds[i].nhap();
        }
        System.out.print("\nNhap email can tim: ");
        String email = sc.nextLine();
        boolean timThay = false;
        for(int i = 0; i < n; i++) {
            if(ds[i].getEmail().equalsIgnoreCase(email)) {
                System.out.println("\nTai khoan ELCIT: " + ds[i].getTaiKhoan());
                System.out.println("\nKet qua hoc tap: " + ds[i].diemTB());
                System.out.println(ds[i]);
                timThay = true;
                break;
            }
        }
        if(!timThay) {
            System.out.println("Khong tim thay sinh vien co email nay!");
        }
    }
}