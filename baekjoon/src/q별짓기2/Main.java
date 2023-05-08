package q별짓기2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i - 1; j++) {
				System.out.print("?");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}