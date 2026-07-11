package buoi4;
import java.util.Scanner;
public abstract class ConVat {
	private String giong, mau;
	private float nang;
	public abstract void Keu();
	public ConVat() {
		giong = new String();
		mau = new String();
		nang = 0.0f;
	}
	public ConVat(ConVat cv) {
		giong = new String(cv.giong);
		mau = new String(cv.mau);
		nang = cv.nang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Nhap can nang: ");
		nang = sc.nextFloat();
	}
	public void in() {
		System.out.println("Con vat la giong " + giong + " co mau " + mau + " va nang " + nang);
	}
	public String toString() {
		String s = new String();
		s += "Giong: " + giong + "\n";
        s += "Mau sac: " + mau + "\n";
        s += "Can nang: " + nang + "\n";
        return s;
	}
}
