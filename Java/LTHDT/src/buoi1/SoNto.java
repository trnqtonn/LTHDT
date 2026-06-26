package buoi1;

import java.util.Scanner;

public class SoNto {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.print("n = ");
		n = kb.nextInt();
		int temp = n;
		String np = "";
		if(n < 2) {
			System.out.println(n + " khong phai la so nguyen to");
		}else {
			int dem = 0;
			for(int i = 1; i <=n; i++) {
				if(n % i == 0) {
					dem++;
				}
			}
			if(dem == 2) {
				System.out.println(n + " la so nguyen to");
				while(temp > 0) {
					np = (temp%2) +np;
					temp=temp/2;
				}
				System.out.println("Nhi phan " + np);
			}else {
				System.out.println(n + " khong la so nguyen to");
			}
		}

	}

}
