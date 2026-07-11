package buoi4;
import java.util.Scanner;
public class SDConVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so con vat: ");
        int n = sc.nextInt();
        ConVat[] ds = new ConVat[n];
        for(int i = 0; i < n; i++) {
            System.out.println("\n1. Bo");
            System.out.println("2. Heo");
            System.out.println("3. De");
            System.out.println("4. Ga");
            System.out.print("Chon giong: ");
            int chon = sc.nextInt();
            switch(chon) {
                case 1:
                    ds[i] = new Bo();
                    break;
                case 2:
                    ds[i] = new Heo();
                    break;
                case 3:
                    ds[i] = new De();
                    break;
                case 4:
                    ds[i] = new Ga();
                    break;
                default:
                    System.out.println("Khong hop le!");
                    i--;
                    continue;
            }
            ds[i].nhap();
        }
        System.out.println("\n===== DANH SACH CON VAT =====");
        for(int i = 0; i < n; i++) {
            ds[i].in();
            ds[i].Keu();
            System.out.println();
        }
    }
}