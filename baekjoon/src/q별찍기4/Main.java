package q별찍기4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < x; i++) {
			for (int j = x - i; j < x; j++) {
				System.out.print(" ");
			}

			for (int i1 = 0; i1 < x-i; i1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
