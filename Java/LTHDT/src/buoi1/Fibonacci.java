package buoi1;
import java.util.Scanner;
public class Fibonacci {
	public static void fibo(int n) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = kb.nextInt();
        fibo(n);
	}
}
