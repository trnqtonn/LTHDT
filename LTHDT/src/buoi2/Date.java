package buoi2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class Date {
    private int ngay;
    private int thang;
    private int nam;
    public Date() {
        ngay = 1;
        thang = 1;
        nam = 2000;
    }
    public Date(int d, int m, int y) {
        ngay = d;
        thang = m;
        nam = y;
    }
    public Date(Date d) {
        ngay = d.ngay;
        thang = d.thang;
        nam = d.nam;
    }
    public void hienThi() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
    public String toString() {
    	return (ngay + "/" + thang + "/" + nam);
    }
    private boolean namNhuan() {
        return (nam % 400 == 0) ||(nam % 4 == 0 && nam % 100 != 0);
    }
    public boolean hopLe() {
        if (nam < 1)
            return false;
        if (thang < 1 || thang > 12)
            return false;
        int soNgay;
        switch(thang) {
            case 2:
                soNgay = namNhuan() ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            default:
                soNgay = 31;
        }
        return ngay >= 1 && ngay <= soNgay;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ngay: ");
            ngay = sc.nextInt();
            System.out.print("Nhap thang: ");
            thang = sc.nextInt();
            System.out.print("Nhap nam: ");
            nam = sc.nextInt();
            if (!hopLe())
                System.out.println("Ngay khong hop le! Nhap lai.");
        }
        while(!hopLe());
    }
    public Date ngayHomSau() {
        Date kq = new Date(ngay, thang, nam);
        kq.ngay++;
        if (!kq.hopLe()) {
            kq.ngay = 1;
            kq.thang++;
            if (kq.thang > 12) {
                kq.thang = 1;
                kq.nam++;
            }
        }
        return kq;
    }
    public Date congNgay(int n) {
        Date kq = new Date(ngay, thang, nam);
        for(int i = 1; i <= n; i++)
            kq = kq.ngayHomSau();
        return kq;
    }
    public String thu() {
        LocalDate d = LocalDate.of(nam, thang, ngay);
        DayOfWeek t = d.getDayOfWeek();

        switch(t) {
            case MONDAY: return "Thứ Hai";
            case TUESDAY: return "Thứ Ba";
            case WEDNESDAY: return "Thứ Tư";
            case THURSDAY: return "Thứ Năm";
            case FRIDAY: return "Thứ Sáu";
            case SATURDAY: return "Thứ Bảy";
            default: return "Chủ Nhật";
        }
    }
}