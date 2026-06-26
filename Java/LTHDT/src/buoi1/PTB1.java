package buoi1;

import java.util.Scanner;

public class PTB1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double a, b, x;
		System.out.print("a= ");
		a = kb.nextDouble();
		System.out.print("b= ");
		b = kb.nextDouble();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			x = -b / a;
			System.out.println("Nghiem x = " + x);
		}

	}

}
