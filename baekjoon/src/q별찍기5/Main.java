package q별찍기5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < x; i++) {
			for (int j = x - 1; 0 < j; j--) {
				System.out.print("?");
			}
			for (int j = 0; i <= j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
