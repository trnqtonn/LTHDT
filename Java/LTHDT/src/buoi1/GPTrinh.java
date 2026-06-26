package buoi1;

import java.util.Scanner;

public class GPTrinh {
	
	public static void gptb1(double a, double b) {
		double x;
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
	
	public static void gptb2(double a, double b, double c) {
		if(a==0) {
			gptb1(b, c);
		}else {
			double d = Math.pow(b, 2) -4*a*c;
			if(d>0) {
				double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
			}else if(d==0) {
				double x = -b / (2 * a);
                System.out.println("Nghiem kep x = " + x);
                
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
			
		}
	}

	public static void main(String[] args) {
		GPTrinh t = new GPTrinh();
		Scanner kb = new Scanner(System.in);
		System.out.print("He so a: ");
		double a = kb.nextDouble();
		System.out.print("He so b: ");
		double b = kb.nextDouble();
		System.out.print("He so c: ");
		double c = kb.nextDouble();
		t.gptb2(a, b, c);
		
	}
}
