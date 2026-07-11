package buoi1;

public class TongDSo {

	public static void main(String[] args) {
		double tong = 0, n, max = Double.MIN_VALUE;
		for(String e : args) {
			try {
				n = Double.parseDouble(e);
			}
			catch(NumberFormatException ex) {
				n = 0;
			}
			tong += n;
			if(max < n) max = n;
		}
		System.out.print("\n Tong =" + tong + ", max =" + max);
	}

}
