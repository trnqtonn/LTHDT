package buoi1;

import java.util.Scanner;

public class TachTen {
	
	public static String layTen(String hoTen) {
		hoTen = hoTen.trim();
        int viTri = hoTen.lastIndexOf(" ");
        if (viTri == -1) {
            return hoTen;
        }
        return hoTen.substring(viTri + 1);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Ho va Ten :");
		String hoTen = kb.nextLine();
        String ten = layTen(hoTen);
        System.out.println("Ten la: " + ten);

	}
}

