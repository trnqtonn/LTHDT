package buoi1;

import java.util.Scanner;

import java.util.InputMismatchException; 
public class Tong2so {
	public static void main(String[]args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		while(true) {
			try {
		System.out.println("Nhap a: ");
		a= sc.nextInt();
		break;}
			catch(InputMismatchException loi) {
				System.out.println("Nhap sai dinh dang, nhap lai!");
				sc.nextLine();
			}
		}
		while(true) {
			try {
		System.out.println("Nhap b: ");
		b=sc.nextInt();
		break;
			} catch(InputMismatchException loi) {
				System.out.println("Nhap sai dinh dang, nhap lai!");
				sc.nextLine();
		}
	}
		System.out.println("Tong= "+(a+b));
}

}