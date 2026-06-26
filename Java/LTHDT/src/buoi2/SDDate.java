package buoi2;
public class SDDate {
    public static void main(String[] args) {
        Date d = new Date();
        d.nhap();
        System.out.print("Ngay vua nhap: ");
        d.hienThi();
        System.out.println("Ngay " + d + " la " + d.thu());
        System.out.print("Ngay hom sau: ");
        d.ngayHomSau().hienThi();
        System.out.println("Ngay " + d.ngayHomSau() + " la " + d.ngayHomSau().thu());
        System.out.print("Cong them 20 ngay: ");
        d.congNgay(20).hienThi();
        System.out.println("Ngay " + d.congNgay(20) + " la " + d.congNgay(20).thu());
    }
}