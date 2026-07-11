package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class DaySo {
	int ds[];
	int n;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		n = sc.nextInt();
		ds = new int[n];
		for (int i = 0; i < ds.length; i++) {
			System.out.print("Nhap vao phan tu " + (i + 1) + ": ");
			ds[i] = sc.nextInt();
		}
	}

	public void in() {
		for (int e : ds) {
			System.out.print(e + " ");
		}
	}

	public void sapxep() {
		for (int i = 0; i < ds.length - 1; i++)
			for (int j = i + 1; j < ds.length; j++) {
				if (ds[i] > ds[j]) {
					int temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
	}

	public int dem(int x) {
		int c = 0;
		for (int e : ds)
			if (e == x)
				c++;
		return c;
	}

	public void them(int x) {
		ds = Arrays.copyOf(ds, n + 1);
		ds[n] = x;
		n++;
	}
	// public void xoa(int x) {
	// int i;
	// for(i = 0; i < n; i++) {
	// if(ds[i] == x)
	// break;
	// }
	// if(i < n) {
	// for(int j = i; j < n - 1; j++) {
	// ds[j] = ds[j + 1];
	// }
	// n--;
	// ds = Arrays.copyOf(ds, n);
	// } else {
	// System.out.println("Khong tim thay x");
	// }
	// }

	public void xoa(int x) {
		int i = 0;
		while (i < n) {
			if (ds[i] == x) {
				for (int j = i; j < n - 1; j++) {
					ds[j] = ds[j + 1];
				}
				n--;
			} else {
				i++;
			}
		}
		ds = Arrays.copyOf(ds, n);
	}

	public static void main(String[] args) {
		DaySo d = new DaySo();
		d.nhap();
		System.out.print("In: ");
		d.in();
		d.sapxep();
		System.out.print("\nSap xep: ");
		d.in();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so can dem x = ");
		int x = sc.nextInt();
		System.out.print("Dem so x xuat hien: " + d.dem(x));
		System.out.print("\nNhap so can them x = ");
		int them = sc.nextInt();
		d.them(them);
		System.out.print("Mang sau khi them: ");
		d.in();
		System.out.print("\nNhap so can xoa x = ");
		int xoa = sc.nextInt();
		d.xoa(xoa);
		System.out.print("Mang sau khi xoa: ");
		d.in();
	}

}
