package buoi3;
import java.util.Scanner;
public class SDGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so loai gach: ");
        int n = sc.nextInt();
        Gach ds[] = new Gach[n];
        for(int i = 0; i < n; i++) {
            System.out.println("\nNhap gach thu " + (i + 1));
            ds[i] = new Gach();
            ds[i].nhap();
        }
        System.out.println("\n===== DANH SACH GACH =====");
        for(int i = 0; i < n; i++) {
            ds[i].hienthi();
            System.out.println();
        }
        int vtMin = 0;
        for(int i = 1; i < n; i++) {
            if(ds[i].chiphimotmetvuong() < ds[vtMin].chiphimotmetvuong()) {
                vtMin = i;
            }
        }
        System.out.println("\n===== GACH CO CHI PHI LOT THAP NHAT =====");
        ds[vtMin].hienthi();
        System.out.println("Chi phi/m2 = " + ds[vtMin].chiphimotmetvuong());
        System.out.println("\n===== CHI PHI LOT NEN 20m x 5m =====");
        for(int i = 0; i < n; i++) {
            System.out.println("\nLoai gach " + (i + 1));
            ds[i].hienthi();
            System.out.println("Tong chi phi: " + ds[i].tongChiPhi(20, 5));
        }
    }
}