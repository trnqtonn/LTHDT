package destodocu;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia{
	private float ttho, dtich;
	private char chluc;
	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		dtich = 0.0f;
		chluc = 'A';
	}
	public QuocGiaPT(QuocGiaPT pt) {
		super((QuocGia)pt);
		ttho = pt.ttho;
		dtich = pt.dtich;
		chluc = pt.chluc;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi tho: ");
		ttho = sc.nextFloat();
		System.out.println("Nhap dien tich quoc gia: ");
		dtich = sc.nextFloat();
		System.out.println("Nhap chau luc cua quoc gia: ");
		chluc = sc.next().charAt(0);
	}
	public void in() {
		super.in();
		System.out.println("Tuoi tho: " + ttho);
		System.out.println("Dien tich quoc gia: " + dtich);
		System.out.println("Chau luc cua quoc gia: " + chluc);
	}
	public char getChLuc() {
	    return chluc;
	}
	public static void main(String[] args) {
		QuocGia ds[];
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = kb.nextInt();
		ds = new QuocGia[n];
		int c;
		for(int i = 0; i < n; i++) {
			System.out.println("Ban chon QuocGia(0) hay QuocGiaPT(1)");
			c = kb.nextInt();
			if(c==0)
				ds[i] = new QuocGia();
			else
				ds[i] = new QuocGiaPT();
			System.out.println("\nNhap quoc gia thu " + (i + 1));
			ds[i].nhap();
			System.out.println("Nhap xong");
		}
		System.out.println("\n===== DANH SACH QUOC GIA =====");
        for (int i = 0; i < n; i++) {
            ds[i].in();
            System.out.println();
        }
        System.out.println("\n===== DANH SACH QUOC GIA GDP TREN 500 TU CHAU PHI =====");
        for(int i = 0; i < n; i++){
			if(ds[i].getGDP() > 500 && ds[i].getChLuc() == 'P'){
				System.out.println("\nTen quoc gia "+ds[i].getTenQG());
			}
		}
        float tongA = 0, tongW = 0, tongM = 0, tongU = 0, tongP = 0;
        int demA = 0, demW = 0, demM = 0, demU = 0, demP = 0;
        for(int i = 0; i < n; i++){
            switch(ds[i].getChLuc()){
                case 'A':
                    tongA += ds[i].getGDP();
                    demA++;
                    break;
                case 'W':
                    tongW += ds[i].getGDP();
                    demW++;
                    break;
                case 'M':
                    tongM += ds[i].getGDP();
                    demM++;
                    break;
                case 'U':
                    tongU += ds[i].getGDP();
                    demU++;
                    break;
                case 'P':
                    tongP += ds[i].getGDP();
                    demP++;
                    break;
            }
        }
        System.out.println("\nGDP trung binh cac nuoc phat trien:");
        if(demA != 0)
            System.out.println("Chau A: " + tongA/demA);
        if(demW != 0)
            System.out.println("Chau W: " + tongW/demW);
        if(demM != 0)
            System.out.println("Chau M: " + tongM/demM);
        if(demU != 0)
            System.out.println("Chau U: " + tongU/demU);
        if(demP != 0)
            System.out.println("Chau P: " + tongP/demP);
	}
}
