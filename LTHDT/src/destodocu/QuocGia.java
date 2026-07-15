package destodocu;
import java.util.Scanner;
public class QuocGia {
	private String msqg, tenqg, tenthudo;
	private float GDP;
	public QuocGia(){
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}
	public QuocGia(QuocGia q){
		msqg = new String(q.msqg);
		tenqg = new String(q.tenqg);
		tenthudo = new String(q.tenthudo);
		GDP = q.GDP;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("Nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println("Nhap tong san phan quoc noi: ");
		GDP = sc.nextFloat();
	}
	public void in() {
		System.out.println("Ma so quoc gia: " + msqg);
		System.out.println("Ten quoc gia: " + tenqg);
		System.out.println("Ten thu do: " + tenthudo);
		System.out.println("Tong san phan quoc noi: " + GDP);
	}
	public float getGDP() {
		return GDP;
	}
	public String getTenQG() {
		return tenqg;
	}
	public char getChLuc() {
		return ' ';
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		System.out.print("Nhap thong tin quoc gia thu nhat\n");
		qg1.nhap();
		System.out.print("Thong tin quoc gia thu nhat\n");
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		System.out.print("Thong tin quoc gia thu hai\n");
		qg2.in();
	}
}
