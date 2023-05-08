package q별찍기2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < x; i++) {
			for (int j = x - i - 1; j > 0; j--) {
//			for (int j = x-i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}